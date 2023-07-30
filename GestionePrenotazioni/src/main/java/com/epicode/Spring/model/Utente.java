package com.epicode.Spring.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "utenti")
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String nomeCompleto;
	private String email;
	
	
	public Utente(String username, String nomeCompleto, String email) {
		super();
		this.username = username;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
	}
	
	
}
