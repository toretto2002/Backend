package com.epicode.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.Spring.model.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {

}
