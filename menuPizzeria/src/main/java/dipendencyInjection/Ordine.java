package dipendencyInjection;

import java.time.LocalDate;
import java.util.List;

import enumerator.StatoOrdine;

public class Ordine {

	private int numOrdine;
	private Tavolo tavolo;
	private StatoOrdine stato;
	private int numCoperti;
	private LocalDate oraOrdine;
	private List<PizzaBase> pizze;
	private List<Drink> drink;
	private double prezzoTotale;
}
