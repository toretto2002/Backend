package g4s2.Products;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainProducts {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<Product>();
		
		List<Product> expensiveBooks = products.stream()
				.filter(el -> el.getCategory() == "Books" && el.getPrice() > 100)
				.collect(Collectors.toList());
		
		System.out.println(expensiveBooks);
		
		List<Product> babiesProducts = products.stream()
				.filter(el -> el.getCategory() == "Baby")
				.collect(Collectors.toList());
		
		System.out.println(babiesProducts);
		
		List<Product>  discountedBoysProducts = products.stream()
				.filter(el -> el.getCategory() == "Boys")
				.collect(Collectors.toList());
		
		discountedBoysProducts.forEach(el -> el.setPrice(el.getPrice() * 0.9));
		
		System.out.println(discountedBoysProducts);
		
		List<Order> orders = new ArrayList<Order>();
		
		List<Order> filteredOrders= orders.stream()
				.filter(el -> el.getCustomer().getTier() == 2 && el.getOrderDate().isAfter(LocalDate.of(2021, 02, 01)) && el.getOrderDate().isBefore(LocalDate.of(2021, 04, 01)) )
				.collect(Collectors.toList());
		
		List<Product> filteredProducts = new ArrayList<Product>();
		
		for(Order el : filteredOrders) {
			filteredProducts.add((Product) el.getProducts());
		}
			
		System.out.println(filteredProducts);
		
		
	}

}
