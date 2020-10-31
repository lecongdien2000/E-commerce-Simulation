package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Shop {
	private String id;
	private String name;
	private String address;
	private Map<Product, Integer> products;
	private List<Bill> billsList;

	public Shop(String name, String address) {
//		this.id = createID();
		this.name = name;
		this.address = address;
		this.products = new HashMap<Product, Integer>();
		this.billsList = new ArrayList<Bill>();
	}

	public void addProduct(Product product, int qty) {
		products.put(product,qty);
	}

	// kiem tra con du so luong san pham nao do hay khong
	public boolean checkQtyProduct(Product product, int qty) {
		return product.getQty() >= qty;
	}
	

	public Map<Product, Integer> getProducts(){
		return this.products;				
	}

	public void addBill(Bill bill) {
		this.billsList.add(bill);	
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public List<Bill> getBillsList() {
		return billsList;
	}
	//Xóa sản phẩm
	public void removeProduct(Product product) {
		products.remove(product);
	}
	public Bill getBill(String id) {
		for(Bill bill: billsList) {
			if(bill.getId().equals(id)) {
				return bill;
			}
		}
		return null;
		
	}


}
