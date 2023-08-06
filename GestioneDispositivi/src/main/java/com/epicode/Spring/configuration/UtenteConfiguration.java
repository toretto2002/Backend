package com.epicode.Spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.Spring.model.Utente;

@Configuration
public class UtenteConfiguration {

	@Bean("utenteBean")
	@Scope("prototype")
	public Utente utenteBean() {
		return new Utente();
	}
	
}
