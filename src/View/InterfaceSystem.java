package View;

import java.util.List;

import Model.Customer;
import Model.Product;

public interface InterfaceSystem {

	boolean isValidID(String id);

	Customer getCustomer(String id);

	String registerCustomerToSystem(String name, String gender, int day, int month, int year, String phone);

	String getProductID();

	void addProduct(Product product);

	void removeProductBuyView(String id);

	Product findProductByID(String text);

	Customer getCurrentCustomer();

	void setCurrentCustomer(Customer customer);

	void removeProductShopView(String id);
	
	List<Product> findProductByName(String name);
	
	List<Product> getProducts();
	
	List<Product> sortProductIncreaseByName();

	List<Product> sortProductDecreaseByName();

	List<Product> sortProductIncreaseByPrice();

	List<Product> sortProductDecreaseByPrice();

}
