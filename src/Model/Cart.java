package Model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Cart {
	private HashMap<Product, Integer> products;
		
	public Cart() {
		this.products = new HashMap<Product, Integer>();
	}
	public void addProduct(Product product, int qty) {
		if (products.containsKey(product)) {
			for (Entry<Product, Integer> entry : products.entrySet())
				
				if (((Product) entry.getKey()).getName().equals(product.getName()))
					entry.setValue((int) entry.getValue() + qty);
		} else
			products.put(product, qty);
	}
	
	public HashMap<Product, Integer> getProducts() {
		// TODO Auto-generated method stub
		return (HashMap<Product, Integer>) this.products;
	}
	
}
