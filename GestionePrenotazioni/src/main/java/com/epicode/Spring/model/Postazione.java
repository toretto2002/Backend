package com.epicode.Spring.model;

import com.epicode.Spring.enumerator.TipoPrenotazione;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "postazioni")
public class Postazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descrizione;
	@Enumerated
	private TipoPrenotazione tipo;
	private int maxOccupanti;
	@ManyToOne
	private Edificio edificio;
	
	public Postazione(String descrizione, TipoPrenotazione tipo, int maxOccupanti, Edificio edificio) {
		super();
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.maxOccupanti = maxOccupanti;
		this.edificio = edificio;
	}
	
	
}
