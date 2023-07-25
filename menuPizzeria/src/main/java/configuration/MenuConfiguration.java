package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import dipendencyInjection.Menu;
import dipendencyInjection.PizzaHawaiana;
import dipendencyInjection.PizzaMargherita;
import dipendencyInjection.PizzaSalami;

@Configuration
public class MenuConfiguration {

	@Bean
	@Scope("singleton")
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}
	
	@Bean
	@Scope("singleton")
	public PizzaHawaiana pizzaHawaiana() {
		return new PizzaHawaiana();
	}
	
	@Bean
	@Scope("singleton")
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}
	
	@Bean
	@Scope("singleton")
	public Menu menu() {
		Menu m = new Menu();
		
		m.getMenuPizza().add(pizzaMargherita());
		m.getMenuPizza().add(pizzaHawaiana());
		m.getMenuPizza().add(pizzaSalami());
		
		return m;
		
	}
}
