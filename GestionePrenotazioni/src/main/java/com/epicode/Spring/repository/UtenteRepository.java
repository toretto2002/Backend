package com.epicode.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.Spring.model.Utente;

@Repository
public interface UtenteRepository extends CrudRepository<Utente,Integer> {
	
}
