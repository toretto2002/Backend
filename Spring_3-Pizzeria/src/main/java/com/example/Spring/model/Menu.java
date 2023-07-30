package com.example.Spring.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private List<FoodItem> menu = new ArrayList<FoodItem>();
	
	

	public List<FoodItem> getMenuPizza() {
		return menu;
	}

	public void setMenuPizza(List<FoodItem> menu) {
		this.menu = menu;
	}
	
	
}
