package Model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Bill {
	public final static int DA_THANH_TOAN = 0;
	public final static int CHUA_THANH_TOAN = 1;
	public final static int HUY = 2;
	
	public final static int XU_LY = 0;
	public final static int VAN_CHUYEN = 1;
	public final static int KET_THUC = 2;
	
	
	private String id;
	private Map<Product, Integer> products;
	private Customer customer;
	private int status;
	private int phase;
	
	public Bill() {
		this.id = ECSystem.createBillID();
		this.products = new HashMap<Product, Integer>();
		this.customer = null;
	}

	
	
	public void add(Entry<Product, Integer> e) {	
		this.products.put(e.getKey(), e.getValue());
	}
	
	public Map<Product, Integer> getProductsMap() {
		return products;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getPhase() {
		return phase;
	}

	public void setPhase(int phase) {
		this.phase = phase;
	}

	public String getId() {
		return id;
	}

	public Map<Product, Integer> getProducts() {
		return products;
	}

	public Customer getCustomer() {
		return customer;
	}
		
	public String getStateString() {
		if(status==1) {
			return "Chưa thanh toán";
		} else if(status==0) {
			return "Đã thanh toán";
		}
		return "Hủy";
	}
	
	public String getPhaseString() {
		if(phase==1) {
			return "Đang vận chuyển";
		} else if(phase==0) {
			return "Đang xử lý";
		}
		return "Kết thúc";
	}
	
	public int getQtyProduct(Product product) {
		return this.products.get(product);
	}
	
	public double getTotalPrice() {
		double sum = 0;
		for(Product product: products.keySet()) {
			sum += getTotalPriceEachProduct(product);
		}
		return sum;
	}


	public double getTotalPriceEachProduct(Product product) {
		return product.getPrice()*this.getQtyProduct(product);
	}
}
