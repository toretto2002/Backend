package com.example.Spring.configuration;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.Spring.model.User;
import com.github.javafaker.Faker;

@Configuration
public class UserConfiguration {


	@Value("${user.admin.name}")private String name;
	@Value("${user.admin.lastname}")private String lastname;
	@Value("${user.admin.city}")private String city;
	@Value("${user.admin.age}")private Integer age;
	@Value("${user.admin.email}")private String email;
	@Value("${user.admin.password}")private String password;
	
	
	
	@Bean("customUserBean")
	@Scope("prototype")
	public User customUser() {
		return new User();
	}
	
	@Bean("adminUserBean")
	@Scope("singleton")
	public User adminUser() {
		return new User(name, lastname, city, age, email, password);
	}
	
	@Bean("fakeUserBean")
	@Scope("prototype")
	public User fakeUser() {
		
		Faker faker = new Faker(new Locale("it-IT"));
		User u = new User();
		
		u.setName(faker.name().firstName());
		u.setLastname(faker.name().lastName());
		u.setCity(faker.address().cityName());
		u.setAge(faker.number().numberBetween(18, 80));
		u.setEmail(faker.internet().emailAddress());
		u.setPassword(faker.internet().password());
		
		return u;
	}
}
