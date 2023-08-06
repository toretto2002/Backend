package com.epicode.Spring.security.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.Spring.model.Dispositivo;
import com.epicode.Spring.model.Utente;
import com.epicode.Spring.service.DispositivoService;
import com.epicode.Spring.service.UtenteService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired UtenteService userService;
	
	@Autowired DispositivoService deviceService;

	@GetMapping("/utenti")
	public ResponseEntity<List<Utente>> allUsers() {
		List<Utente> listaUtenti = userService.getAllUser();
		ResponseEntity<List<Utente>> resp = new ResponseEntity<List<Utente>>(listaUtenti, HttpStatus.OK);
		return resp;
	}
	
	@PostMapping("/utenti")
	@PreAuthorize("isAuthenticated()")
	public ResponseEntity<Utente> createUtente(@RequestBody Utente user){
		Utente u = userService.createUser(user);
		return new ResponseEntity<Utente>(u, HttpStatus.CREATED);
	}
	
	@GetMapping("/utenti/{id}")
	public ResponseEntity<Utente> findUtenteById(@PathVariable Long id){
		Utente u = userService.getUserById(id);
		return new ResponseEntity<Utente>(u, HttpStatus.FOUND);
	}
	
	@PutMapping("/utenti/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody Utente user) {
		Utente u = userService.updateUser(id, user);
		return new ResponseEntity<Utente>(u, HttpStatus.OK);
	}
	
	@DeleteMapping("/utenti/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<String> removeUser(@PathVariable Long id) {
		String msg = userService.removeUserByID(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	
	
	
	@GetMapping("/dispositivi")
	public ResponseEntity<List<Dispositivo>> allDevices() {
		List<Dispositivo> listaDispositivi = deviceService.getAllDevices();
		ResponseEntity<List<Dispositivo>> resp = new ResponseEntity<List<Dispositivo>>(listaDispositivi, HttpStatus.OK);
		return resp;
	}
	
	@PostMapping("/dispositivi")
	@PreAuthorize("isAuthenticated()")
	public ResponseEntity<Dispositivo> createDispositivo(@RequestBody Dispositivo device){
		Dispositivo d = deviceService.createDevice(device);
		return new ResponseEntity<Dispositivo>(d, HttpStatus.CREATED);
	}
	
	@GetMapping("/dispositivi/{id}")
	public ResponseEntity<Dispositivo> findDispositivoById(@PathVariable Long id){
		Dispositivo d = deviceService.getDeviceById(id);
		return new ResponseEntity<Dispositivo>(d, HttpStatus.FOUND);
	}
	
	@PutMapping("/dispositivi/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> updateDevice(@PathVariable Long id, @RequestBody Dispositivo device) {
		Dispositivo d = deviceService.updateDevice(id, device);
		return new ResponseEntity<Dispositivo>(d, HttpStatus.OK);
	}
	
	@DeleteMapping("/dispositivi/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<String> removeDevice(@PathVariable Long id) {
		String msg = deviceService.removeDeviceByID(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
}
