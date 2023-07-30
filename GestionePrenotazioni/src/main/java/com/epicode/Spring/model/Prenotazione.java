package com.epicode.Spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Prenotazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int numPosti;
	private Postazione postazione;
	private Utente utente;
	
	public Prenotazione(int numPosti, Postazione postazione, Utente utente) {
		super();
		this.numPosti = numPosti;
		this.postazione = postazione;
		this.utente = utente;
	}
	
	
}
