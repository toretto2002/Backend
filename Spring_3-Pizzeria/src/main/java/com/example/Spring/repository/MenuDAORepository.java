package com.example.Spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Spring.model.FoodItem;

public interface MenuDAORepository extends CrudRepository<FoodItem, Long> {
	
	public List<FoodItem> findByPriceBetween(Integer x, Integer y);

}
