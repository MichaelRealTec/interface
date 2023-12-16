package model.entities;

public class Invoice {
	// Atributos
	private Double basicPayment;
	private Double tax;
	
	// Métodos Getters e Setters
	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}
	
	public Double getBasicPayment() {
		return basicPayment;
	}
	
	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double getTax() {
		return tax;
	}
	
	// Método Construtor
	public Invoice() {
		
	}
	
	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}
	
	// Métodos
	public Double getTotalPayment() {
		return getBasicPayment() + getTax();
	}
	
}
