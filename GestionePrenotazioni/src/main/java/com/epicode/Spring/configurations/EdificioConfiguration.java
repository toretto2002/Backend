package com.epicode.Spring.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.Spring.model.Edificio;

@Configuration
public class EdificioConfiguration {

	@Bean("generaEdificio")
	@Scope("prototype")
	public Edificio edificio() {
		return new Edificio();
	}
}
