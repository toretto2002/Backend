package com.example.Spring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Drink implements FoodItem {
	
	private long id;
	private String tipo;
	private double quantita;
	private double calorie;
	private double prezzo;
	
	
	public Drink(String tipo, double quantita, double calorie, double prezzo) {
		super();
		this.tipo = tipo;
		this.quantita = quantita;
		this.calorie = calorie;
		this.prezzo = prezzo;
	}
}
