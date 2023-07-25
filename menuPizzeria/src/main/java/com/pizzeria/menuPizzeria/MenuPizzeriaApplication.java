package com.pizzeria.menuPizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MenuPizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MenuPizzeriaApplication.class, args);
		
		GestioneMenu menu = new GestioneMenu();
		
		menu.stampaMenu();
	}

}
