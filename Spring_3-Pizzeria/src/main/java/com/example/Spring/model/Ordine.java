package com.example.Spring.model;

import java.time.LocalDate;

import java.util.List;

import com.example.Spring.enumerator.StatoOrdine;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Ordine {

	private long id;
	private int numOrdine;
	private Tavolo tavolo;
	private StatoOrdine stato;
	private int numCoperti;
	private LocalDate oraOrdine;
	private List<PizzaBase> pizze;
	private List<Drink> drink;
	private double prezzoTotale;
	
	public Ordine(int numOrdine, Tavolo tavolo, StatoOrdine stato, int numCoperti, LocalDate oraOrdine,
			List<PizzaBase> pizze, List<Drink> drink, double prezzoTotale) {
		super();
		this.numOrdine = numOrdine;
		this.tavolo = tavolo;
		this.stato = stato;
		this.numCoperti = numCoperti;
		this.oraOrdine = oraOrdine;
		this.pizze = pizze;
		this.drink = drink;
		this.prezzoTotale = prezzoTotale;
	}
	
	
}
