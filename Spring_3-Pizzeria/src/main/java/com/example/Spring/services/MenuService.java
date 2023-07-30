package com.example.Spring.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Spring.model.Ordine;
import com.example.Spring.repository.MenuDAORepository;

public class MenuService {

	@Autowired MenuDAORepository repo;
	
	
	public Ordine createOrder(Ordine o) {
		repo.save(o);
		return null;
	}
}
