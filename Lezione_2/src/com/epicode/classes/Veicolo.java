package com.epicode.classes;

public class Veicolo {
	
	public String marca;
	public String modello;
	public String targa;
	
	public Veicolo(String marca, String modello, String targa ) {
		this.marca= marca;
		this.modello= modello;
		this.targa= targa;
	}
	
	public void avviaVeicolo() {
		System.out.println("Veicolo avviato");
	}
	
	public void fermaVeicolo() {
		System.out.println("Veicolo fermo");
	}
}
