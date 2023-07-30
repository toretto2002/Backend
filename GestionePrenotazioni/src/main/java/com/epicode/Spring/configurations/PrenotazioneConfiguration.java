package com.epicode.Spring.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.Spring.model.Postazione;
import com.epicode.Spring.model.Prenotazione;
import com.epicode.Spring.model.Utente;

@Configuration
public class PrenotazioneConfiguration {

	@Bean
	@Scope("prototype")
	public Prenotazione prenotazione() {
		return new Prenotazione();
	}
}
