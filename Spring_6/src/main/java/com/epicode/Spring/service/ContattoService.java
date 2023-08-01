package com.epicode.Spring.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.Spring.model.Contatto;
import com.epicode.Spring.repository.ContattoRepository;

@Service
public class ContattoService {

	@Autowired ContattoRepository contattoRepo;
	@Autowired @Qualifier("fakeContattoBean") private ObjectProvider<Contatto> contattoProvider;
	
	public void createFakeContact() {
		Contatto c = contattoProvider.getObject();
		contattoRepo.save(c);
	}
	
	public List<Contatto> getAllContacts(){
		return (List<Contatto>) contattoRepo.findAll();
	}
	
	public Contatto getContattoById(Long id) {
		return contattoRepo.findById(id).get();
	}
	
	public Contatto createContatto(Contatto contact) {
		return contattoRepo.save(contact);
	}
}
