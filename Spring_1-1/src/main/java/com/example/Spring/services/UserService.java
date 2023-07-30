package com.example.Spring.services;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.example.Spring.configuration.UserListConfiguration;
import com.example.Spring.model.User;
import com.example.Spring.model.UserList;


@Service
public class UserService {
	
	@Autowired @Qualifier("userList") private ObjectProvider<UserList> userListProvider;
	
	@Autowired @Qualifier("customUserBean") private ObjectProvider<User> customUserProvider;
	@Autowired @Qualifier("adminUserBean") private ObjectProvider<User> adminUserProvider;
	@Autowired @Qualifier("fakeUserBean") private ObjectProvider<User> fakeUserProvider;
	
	
	
//	public void creaLista() {
//		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(UserListConfiguration.class);
//		lista = (UserList) appContext.getBean("createUserList");	
//		appContext.close();
//	}
	
	public void addUserList(User u) {
		
//		UserList userlist = userListProvider.getObject();
//		String name = userlist.getName();
//		List<User> lista = userlist.getUserList();
//		lista.add(u);
		
		List<User> lista = userListProvider.getObject().getUserList();
		lista.add(u);
	}
	
	public void getUserList() {
		
		List<User> lista = userListProvider.getObject().getUserList();
		lista.forEach(u -> System.out.println(u));
	}
	
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
