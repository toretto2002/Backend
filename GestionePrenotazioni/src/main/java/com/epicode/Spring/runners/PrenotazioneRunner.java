package com.epicode.Spring.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.Spring.model.Edificio;
import com.epicode.Spring.model.Utente;
import com.epicode.Spring.services.PrenotazioneService;

@Component
public class PrenotazioneRunner implements CommandLineRunner  {

	@Autowired PrenotazioneService ps;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("ciaooooo");
		
		Edificio e1 = ps.creaEdificio("B1", "via Tommaso 1", "Milano");
		
		System.out.println(e1);
		
		Utente u1 = ps.creaUtente("tommasino", "Tommaso", "tom.w@example.com");
		
		ps.saveUtente(u1);
		
		System.out.println(u1);
		
	}

}
