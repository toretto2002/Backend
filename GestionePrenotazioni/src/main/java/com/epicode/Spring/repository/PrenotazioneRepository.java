package com.epicode.Spring.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.Spring.model.Prenotazione;

@Repository
public interface PrenotazioneRepository extends CrudRepository<Prenotazione,Integer> {

}
