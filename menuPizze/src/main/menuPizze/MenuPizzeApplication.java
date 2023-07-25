package com.pizzeria.menuPizze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dipendencyInjection.Drink;
import dipendencyInjection.DrinkConfigurator;

@SpringBootApplication
public class MenuPizzeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MenuPizzeApplication.class, args);
		
		configDrink("Lemonade", 0.33, 128, 2.5);
		System.out.println("ciao");
	}
	
	public static void configDrink(String tipo, double quantita, double calorie, double prezzo) {
		
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(DrinkConfigurator.class);
		
		Drink d1 = (Drink) appContext.getBean("drink", tipo, quantita, calorie, prezzo);
		System.out.println(d1);
		
		appContext.close();

	}

}
