package com.epicode.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.Spring.model.Contatto;

@Repository
public interface ContattoRepository extends CrudRepository<Contatto, Long> {

}
