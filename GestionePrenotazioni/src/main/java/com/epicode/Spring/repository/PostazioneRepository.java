package com.epicode.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.Spring.model.Postazione;

@Repository
public interface PostazioneRepository extends CrudRepository<Postazione,Integer> {

}
