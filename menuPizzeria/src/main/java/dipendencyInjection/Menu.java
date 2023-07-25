package dipendencyInjection;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private List<PizzaBase> menuPizza = new ArrayList<PizzaBase>();
	
	

	public List<PizzaBase> getMenuPizza() {
		return menuPizza;
	}

	public void setMenuPizza(List<PizzaBase> menuPizza) {
		this.menuPizza = menuPizza;
	}
	
	
}
