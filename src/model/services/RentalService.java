package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	// Atributos
	private Double pricePerHour;
	private Double pricePerDay;
	
	private BrazilTaxService taxService;
		
	// Métodos Getters e Setters
	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}
	
	public Double getPricePerHour() {
		return pricePerHour;
	}
	
	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	
	public Double getPricePerDay() {
		return pricePerDay;
	}
	
	public void setTaxService(BrazilTaxService taxService) {
		this.taxService = taxService;
	}
	
	public BrazilTaxService getTaxService() {
		return taxService;
	}
	
	// Método construtor
	public RentalService() {
		
	}
	
	
	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	// Métodos
	public void processInvoice(CarRental carRental) {
		// Encontra a duração de dias com base em duas datas
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes(); // minutes = duração dos horários convertido em minutos
		double hours = minutes / 60.0;
		
		double basicPayment;
		// regra 
		if(hours <= 12) {
			// horas
			basicPayment = pricePerHour * Math.ceil(hours);  // Função Math.ceil (arredonda o número para cima)
			
		} else {
			// dias
			basicPayment = pricePerDay * Math.ceil(hours / 24.0);
		}
		
		// Imposto
		double tax = taxService.tax(basicPayment);
		
		
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
}
