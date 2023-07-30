package com.example.Spring.repository;

import org.springframework.stereotype.Repository;

import com.example.Spring.model.User;

@Repository
public interface IUserDAORepository {

	public void create(User u);
	public void update(User u);
	public void delete(User u);
	public void getById(User u);
}
