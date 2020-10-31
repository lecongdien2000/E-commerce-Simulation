package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import Model.Customer;
import Model.Date;
import Model.ECSystem;
import Model.Product;
import Model.SortByName;
import Model.SortByPrice;

public class MySystem implements InterfaceSystem {
	ECSystem system;
	private Customer customer;
	

	public MySystem() {
		system = ECSystem.getSystem();
	}

	@Override
	public boolean isValidID(String id) {
		return this.system.getCustomer(id) != null;
	}

	@Override 
	public Customer getCustomer(String id) {
		return this.system.getCustomer(id);
	}                                                                           

	@Override
	public String registerCustomerToSystem(String name, String gender, int day, int month, int year, String phone) {
		boolean customerGender;
		if (gender.equals("Nam")) {
			customerGender = Customer.MALE;
		} else
			customerGender = Customer.FEMALE;
		Customer customer = new Customer(name, customerGender, new Date(day, month, year), phone);
		system.addCustomer(customer);
		return customer.getId();
	}

	@Override
	public String getProductID() {
		return system.createProductID();
	}

	@Override
	public void addProduct(Product product) {
		system.getProducts().add(product);

	}

	@Override
	public void removeProductBuyView(String id) {
		Product thisProduct = null;
		for (Product product : system.getProducts()) {
			if (product.getId().equals(id)) {
				thisProduct = product;
				break;
			}
		}
		system.getProducts().remove(thisProduct);
	}

	@Override
	public Product findProductByID(String id) {
		for (Product product : system.getProducts()) {
			if (product.getId().equals(id)) {
				return product;
			}
		}
		return null;
	}

	@Override
	public Customer getCurrentCustomer() {

		return this.customer;
	}

	@Override
	public void setCurrentCustomer(Customer customer) {
		this.customer = customer;

	}

	@Override
	public void removeProductShopView(String id) {
		Product product = findProductByID(id);
		product.getShop().removeProduct(product);
	}

	@Override
	public List<Product> findProductByName(String name) {
		return system.findProductByName(name);
	}

	@Override
	public List<Product> getProducts() {
		return system.getProducts();
	}

	@Override
	public List<Product> sortProductIncreaseByName() {
		system.setSort(new SortByName()); 
		return system.sortIncrease();
	}

	@Override
	public List<Product> sortProductDecreaseByName() {
		system.setSort(new SortByName()); 
		return system.sortDecrease();
	}

	@Override
	public List<Product> sortProductIncreaseByPrice() {
		system.setSort(new SortByPrice()); 
		return system.sortIncrease();
	}

	@Override
	public List<Product> sortProductDecreaseByPrice() {
		system.setSort(new SortByPrice()); 
		return system.sortDecrease();
	}
	
	

}
