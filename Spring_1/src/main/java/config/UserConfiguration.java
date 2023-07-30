package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;


import model.User;

@Configuration
@PropertySource("classpath:application.properties")
public class UserConfiguration {
	
	@Value("${user.admin.name}")private String adminName;
	@Value("${user.admin.lastname}")private String adminLastName;
	@Value("${user.admin.city}")private String adminCity;
	@Value("${user.admin.email}")private String adminEmail;

	@Bean
	@Scope("prototype")
	public User customUser() {
		return new User();
	}
	
	@Bean
	@Scope("prototype")
	public User newUser(String name, String lastname, String city, String email) {
		return new User();
	}
	
	@Bean
	@Scope("singleton")
	public User newAdmin() {
		return new User();
	}
}
