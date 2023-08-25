package com.epicode.Spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.Spring.model.Sonda;
import com.epicode.Spring.repositories.SondaRepository;
import com.epicode.Spring.services.AllarmeService;

@RestController
@RequestMapping("/sonde")
public class SondaController {

	@Autowired
    private SondaRepository sondaRepository;
    
    @Autowired
    private AllarmeService allarmeService; 
    
    @PostMapping("/aggiungi")
    public ResponseEntity<?> aggiungiSonda(@RequestBody Sonda sonda) {
        Sonda nuovaSonda = sondaRepository.save(sonda);
        allarmeService.controllaAllarme(nuovaSonda); 
        return ResponseEntity.ok(nuovaSonda);
    }
}
