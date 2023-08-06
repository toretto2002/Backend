package com.epicode.Spring.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.Spring.model.Utente;
import com.epicode.Spring.repositories.UtenteRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UtenteService {
	
	@Autowired UtenteRepository userRepo;
	
	@Autowired @Qualifier("utenteBean") private ObjectProvider<Utente> userProvider;
	

	public void createCustomUtente(String username, String name, String lastname, String email) {
		Utente u = userProvider.getObject();
		u.setUsername(username);
		u.setName(name);
		u.setLastname(lastname);
		u.setEmail(email);
		
		userRepo.save(u); 
	}
	
	public Utente createUser(Utente u) {
		return userRepo.save(u);
	}
	
	public List<Utente> getAllUser(){
		return userRepo.findAll();
	}
	
	public Utente getUserById(Long id) {
		if(!userRepo.existsById(id)) {
			throw new EntityNotFoundException("This User doesn't exist!!!");
		}
		return userRepo.findById(id).get();
	}
	
	public Utente updateUser(Long id, Utente user) {
		if(!userRepo.existsById(id)) {
			throw new EntityNotFoundException("This User doesn't exist!!!");
		}
		if(id != user.getId()) {
			throw new EntityNotFoundException("Id and UserID don't match!");
		}
		return  userRepo.save(user);
		
	}
	
	public String removeUserByID(Long id) {
		if(!userRepo.existsById(id)) {
			throw new EntityNotFoundException("This User doesn't exist!!!");
		}
		Utente u = getUserById(id);
		userRepo.delete(u);
		return "User deleted!!!";
	}
}
