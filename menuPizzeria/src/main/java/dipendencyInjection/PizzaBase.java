package dipendencyInjection;

public abstract class PizzaBase {

	private String nome;
	private double prezzo;
	private double calorie;
	
	public String getMenuLine() {
		return this.nome + " - calorie" + this.calorie + " - prezzo:" + this.prezzo;
	}

	public PizzaBase(String nome, double prezzo, double calorie) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.calorie = calorie;
	}
	
	
}
