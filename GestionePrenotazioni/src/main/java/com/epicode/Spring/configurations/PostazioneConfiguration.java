package com.epicode.Spring.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.Spring.enumerator.TipoPrenotazione;
import com.epicode.Spring.model.Edificio;
import com.epicode.Spring.model.Postazione;

@Configuration
public class PostazioneConfiguration {

	@Bean
	@Scope("prototype")
	public Postazione postazione() {
		return new Postazione();
	}
}
