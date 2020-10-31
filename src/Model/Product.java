package Model;

import java.util.Comparator;

public class Product {
	private String id; //Form: SP**** Ex: SP0A4B 
	private String name;
	private Shop shop;
	private double price; //VND 

	public Product(String name, double price) {
		//Khoi tao product
		this.name = name;
		this.price = price;
		
	}

	public Product(String id, String name, double price) {
		//Khoi tao product
		this.id = id;
		this.name = name;
		this.price = price;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public Shop getShop() {
		return this.shop;
	}

	public String getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}
	
	public int getQty() {
		return this.shop.getProducts().get(this);
	}
	
	public void decreaseQty(int decreaseQty) {
		this.getShop().getProducts().put(this, this.getQty() - decreaseQty);
	}

}
