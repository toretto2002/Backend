package Biblio.Classes;

public class Autor {
	
	private String nome;
	private String cognome;
	
	public Autor(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	@Override
	public String toString() {
		return " Nome: " + this.nome + " Cognome: " + this.cognome;
	}
	
	
	
	

}
