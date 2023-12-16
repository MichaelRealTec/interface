package model.entities;
import java.time.LocalDateTime;


public class CarRental {
	// Atributos
	private LocalDateTime start;
	private LocalDateTime finish;
	private Vehicle vehicle;
	private Invoice invoice;
	
	
	// Métodos Getters e Setters
	public void setStart(LocalDateTime start) {
		this.start = start;
	}
	
	public LocalDateTime getStart() {
		return start;
	}
	
	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}
	
	public LocalDateTime getFinish() {
		return finish;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public Invoice getInvoice() {
		return invoice;
	}
	
	
	// Método construtor
	public CarRental() {
		
	}
	
	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}
	
}
