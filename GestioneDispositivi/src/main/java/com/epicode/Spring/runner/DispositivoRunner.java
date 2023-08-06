package com.epicode.Spring.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.epicode.Spring.service.DispositivoService;

@Component
public class DispositivoRunner implements ApplicationRunner {
	
	@Autowired DispositivoService deviceService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
//		deviceService.createCustomDevice("PC");
//		deviceService.createCustomDevice("TABLET");
//		deviceService.createCustomDevice("TELEFONO");
//		deviceService.createCustomDevice("PC");
//		deviceService.createCustomDevice("TABLET");
		
	}

}
