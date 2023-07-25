package dipendencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class DrinkConfigurator {
	
	
	
	@Bean
	@Scope("prototype")
	public Drink drink(String tipo, double quantita, double calorie, double prezzo) {
		return new Drink(tipo, quantita, calorie, prezzo);
	}
	
}
