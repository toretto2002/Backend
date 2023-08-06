package com.epicode.Spring.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.epicode.Spring.service.UtenteService;

@Component
public class UtenteRunner implements ApplicationRunner {

	@Autowired UtenteService userService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		//userService.createCustomUtente("tommasooo", "Tommaso", "Brigaglia", "tommaso.brigaglai@example.com");
	}

}
