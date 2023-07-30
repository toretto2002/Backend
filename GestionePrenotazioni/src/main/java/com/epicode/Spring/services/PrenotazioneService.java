package com.epicode.Spring.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.Spring.model.Edificio;
import com.epicode.Spring.model.Utente;
import com.epicode.Spring.repository.UtenteRepository;

@Service
public class PrenotazioneService {

	@Autowired @Qualifier("generaEdificio") ObjectProvider<Edificio> edificioProvider;
	@Autowired @Qualifier("generaUtente") ObjectProvider<Utente> utenteProvider;
	
	@Autowired UtenteRepository utenteRepo;
	
	public Edificio creaEdificio(String nome, String indirizzo, String citta) {
		Edificio e = edificioProvider.getObject();
		e.setNome(nome);
		e.setIndirizzo(indirizzo);
		e.setCitta(citta);
		return e;
	}
	
	public Utente creaUtente(String username, String nome, String email) {
		Utente u = utenteProvider.getObject();
		u.setUsername(username);
		u.setNomeCompleto(nome);
		u.setEmail(email);
		utenteRepo.save(u);
		return u;
	}
	
	public void saveUtente(Utente u) {
		utenteRepo.save(u);
	}
}
