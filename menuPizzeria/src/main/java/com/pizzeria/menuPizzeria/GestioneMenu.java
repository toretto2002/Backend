package com.pizzeria.menuPizzeria;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.MenuConfiguration;
import dipendencyInjection.Menu;

public class GestioneMenu {
	AnnotationConfigApplicationContext appContext;
	Menu menu ;
	public GestioneMenu() {
		
		 appContext = new AnnotationConfigApplicationContext(MenuConfiguration.class);
		
		 menu = (Menu) appContext.getBean("menu");
	}
	
	public void stampaMenu() {
		System.out.println("--------menu--------");
		System.out.println("Pizze");
		
		menu.getMenuPizza().forEach(p -> System.out.println(p.getMenuLine()));
	}
}
