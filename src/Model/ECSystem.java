package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;


public class ECSystem {
	private static ECSystem singleSystem;
	
	private List<Customer> customers;
	private List<Product> products;
	private static int customerID = 0;
	private static int productID = 0;
	private static int billID = 0;
	
	private Sort sort;

	private ECSystem() {
		customers = new ArrayList<Customer>();
		products = new ArrayList<Product>();
		this.sort = new SortByPrice();
	}
	
	public static ECSystem getSystem() {
		if(singleSystem==null) {
			singleSystem = new ECSystem();
		}
		return singleSystem;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}
	
	public List<Product> sortDecrease(){
		List<Product> result = products.subList(0, products.size());
		sort.sortDecrease(result);
		return result;
	}
	
	public List<Product> sortIncrease(){
		List<Product> result = products.subList(0, products.size());
		sort.sortIncrease(result);
		return result;
	}
	
	public void addCustomer(Customer customer) {
		// Them Customer vao List
		customer.setId(this.createCustomerID());
		this.customers.add(customer);
	}
	
	public static String createCustomerID() {
		String sign = "KH";
		String numID = String.valueOf(customerID++);
		String iD = sign + numID;
		return iD;
	}
	
	public static String createProductID() {
		String sign = "SP";
		String numID = String.valueOf(productID++);		
		String iD = sign + numID;
		return iD;
	}
	
	public static String createBillID() {
		String sign = "HD";
		String numID = String.valueOf(billID++);		
		String iD = sign + numID;
		return iD;
	}

	public Customer getCustomer(String id) {
		//Tim customer voi ID tren 
		for (Customer customer : customers) 
			if (customer.getId().equals(id)) 
				return customer;		
		//Tra ve
		return null;
	}


	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public List<Product> findProductByName(String value) {
		List<Product> r = new ArrayList<Product>();
		for(Product product: products) {
			if(product.getName().toLowerCase().contains(value.toLowerCase())) {
				r.add(product);
			}
		}		
		return r;
	}

}
