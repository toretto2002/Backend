package dipendencyInjection;

public class Drink {
	
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


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getQuantita() {
		return quantita;
	}


	public void setQuantita(double quantita) {
		this.quantita = quantita;
	}


	public double getCalorie() {
		return calorie;
	}


	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	@Override
	public String toString() {
		return "Drink [tipo=" + tipo + ", quantita=" + quantita + ", calorie=" + calorie + ", prezzo=" + prezzo + "]";
	}


	
	
	
	
	
}
