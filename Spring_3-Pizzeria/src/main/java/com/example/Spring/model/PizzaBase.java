package com.example.Spring.model;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public abstract class PizzaBase implements FoodItem {

	private long id;
	private String nome;
	private double prezzo;
	private double calorie;
	
	public PizzaBase(String nome, double prezzo, double calorie) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.calorie = calorie;
	}
	
	
}
