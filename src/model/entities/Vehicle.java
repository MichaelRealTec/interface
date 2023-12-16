package model.entities;

public class Vehicle {
	// Atributos
	private String model;
	
	// Método Construtor
	public Vehicle(String model) {
		this.model = model;
	}
	
	public Vehicle() {
		
	}
	
	// Métodos Getters e Setters
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
		
}
