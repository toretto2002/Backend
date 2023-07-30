package com.example.Spring.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.Spring.model.User;

@Service
public class UserService {

	@Autowired @Qualifier("customUserBean") private ObjectProvider<User> customUserProvider;
	@Autowired @Qualifier("adminUserBean") private ObjectProvider<User> adminUserProvider;
	@Autowired @Qualifier("fakeUserBean") private ObjectProvider<User> fakeUserProvider;
	
	public User createFakeUser() {
		return fakeUserProvider.getObject();
	}
	
	public User createAdminUser() {
		return adminUserProvider.getObject();
	}
	
	public User createCustomUser(String name, String lastname, String city, Integer age, String email, String password) {
		
		User u = customUserProvider.getObject();
		
		u.setName(name);
		u.setLastname(lastname);
		u.setCity(city);
		u.setAge(age);
		u.setEmail(email);
		u.setPassword(password);
		
		return u;
	}
}
