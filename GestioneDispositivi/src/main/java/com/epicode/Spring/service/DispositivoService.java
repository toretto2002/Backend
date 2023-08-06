package com.epicode.Spring.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.Spring.model.Dispositivo;
import com.epicode.Spring.model.Utente;
import com.epicode.Spring.repositories.DispositivoRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class DispositivoService {

	@Autowired DispositivoRepository deviceRepo;
	
	@Autowired @Qualifier("customDeviceBean") private ObjectProvider<Dispositivo> deviceProvider;
	
	public void createCustomDevice(String type) {
		Dispositivo d = deviceProvider.getObject();
		d.setType(type);
		deviceRepo.save(d);
	}
	
	public Dispositivo createDevice(Dispositivo d) {
		return deviceRepo.save(d);
	}
	
	public List<Dispositivo> getAllDevices(){
		return deviceRepo.findAll();
	}
	
	public Dispositivo getDeviceById(Long id) {
		if(!deviceRepo.existsById(id)) {
			throw new EntityNotFoundException("This device doesn't exist!!!");
		}
		return deviceRepo.findById(id).get();
	}
	
	public Dispositivo updateDevice(Long id, Dispositivo device) {
		if(!deviceRepo.existsById(id)) {
			throw new EntityNotFoundException("This device doesn't exist!!!");
		}
		if(id != device.getId()) {
			throw new EntityNotFoundException("Id and deviceID don't match!");
		}
		return  deviceRepo.save(device);
		
	}
	
	public String removeDeviceByID(Long id) {
		if(!deviceRepo.existsById(id)) {
			throw new EntityNotFoundException("This device doesn't exist!!!");
		}
		Dispositivo d = getDeviceById(id);
		deviceRepo.delete(d);
		return "Device deleted!!!";
	}
}
