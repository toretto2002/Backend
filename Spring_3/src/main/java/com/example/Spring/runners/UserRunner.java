package com.example.Spring.runners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Spring.model.User;
import com.example.Spring.service.UserService;

@Component
public class UserRunner implements CommandLineRunner {
	
	@Autowired UserService userservice;
	Logger log = LoggerFactory.getLogger(UserRunner.class);

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ciao");
		
		User admin = userservice.createAdminUser();
		User fake = userservice.createFakeUser();
		User custom = userservice.createCustomUser("giuseppe", "verd", "milano", 22, "g.verdi@example.com", "12345");
		
		
	}

}
