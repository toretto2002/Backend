package com.epicode.Spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.Spring.model.Contatto;
import com.epicode.Spring.service.ContattoService;

@RestController
@RequestMapping("/api/contatti")
public class ContattoController {

	@Autowired ContattoService contattoService;
	
	@GetMapping
	public ResponseEntity<List<Contatto>> getAll(){
		List<Contatto> listaContatti = contattoService.getAllContacts();
		ResponseEntity<List<Contatto>> resp = new ResponseEntity<List<Contatto>>(listaContatti, HttpStatus.OK);
		return resp;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id){
		try {
			Contatto c = contattoService.getContattoById(id);
			return new ResponseEntity<Contatto>(c, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public ResponseEntity<?> creaContatto(Contatto contact){
		try {
			contattoService.createContatto(contact);
			return new ResponseEntity<Contatto>(contact, HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
}
