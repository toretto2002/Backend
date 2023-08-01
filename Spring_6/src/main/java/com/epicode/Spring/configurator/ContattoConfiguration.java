package com.epicode.Spring.configurator;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.Spring.model.Contatto;
import com.github.javafaker.Faker;

@Configuration
public class ContattoConfiguration {

	@Bean("contattoBean")
	@Scope("prototype")
	public Contatto generaContatto() {
		return new Contatto();
	}
	
	@Bean("fakeContattoBean")
	@Scope("prototype")
	public Contatto generaFakeContatto() {
		Faker faker = new Faker(new Locale("it-IT"));
		Contatto c = new Contatto();
		String name = faker.name().firstName();
		String lastname = faker.name().lastName(); 
		c.setName(name);
		c.setLastname(lastname);
		c.setCitta(faker.address().city());
		c.setEmail(name.toLowerCase() + "." + lastname.toLowerCase() + "@example.com");
		return c;
	}
}
