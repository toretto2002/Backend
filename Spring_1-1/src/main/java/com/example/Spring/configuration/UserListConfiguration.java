package com.example.Spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.Spring.model.User;
import com.example.Spring.model.UserList;

@Configuration
public class UserListConfiguration {

	@Bean("userList")
	@Scope("singleton")
	public UserList customUserList() {
		return new UserList();
	}
}
