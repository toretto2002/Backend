package com.epicode.Spring.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.Spring.model.Utente;

@Configuration
public class UtenteConfiguration {

	@Bean("generaUtente")
	@Scope("prototype")
	public Utente utente() {
		return new Utente();
	}
}
