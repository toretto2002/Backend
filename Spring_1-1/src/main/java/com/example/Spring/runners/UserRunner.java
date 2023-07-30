package com.example.Spring.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Spring.model.User;
import com.example.Spring.services.UserService;

@Component
public class UserRunner implements CommandLineRunner {
	
	@Autowired private UserService us;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("caìpp");
		
		User admin = us.createAdminUser();
		User custom = us.createCustomUser("giuseppe", "verd", "milano", 22, "g.verdi@example.com", "12345");
		User fake = us.createFakeUser();
		
		us.addUserList(custom);
		us.addUserList(admin);
		us.addUserList(fake);
		
		us.getUserList();
		
	}

}
