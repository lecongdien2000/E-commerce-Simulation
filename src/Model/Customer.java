package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Customer {
	public final static boolean MALE = true;
	public final static boolean FEMALE = false;

	private String id; // Form: KH**** Ex: KH0A4B
	private String name;
	private boolean gender; // true = male
	private Date dateOfBirth;
	private String phone;
	private Cart cart;
	private Shop shop;
	private List<Bill> billsList;

	public Customer(String name, boolean gender, Date date, String phone) {
		// Khoi tao customer
		this.name = name;
		this.dateOfBirth = date;
		this.gender = gender;
		this.phone = phone;
		this.cart = new Cart();
		this.billsList = new ArrayList<Bill>();
	}

	private boolean checkID(String ID) {
		// Kiem tra ID nhap vao co hop le hay khong
		return false;
	}

	public Customer(String id, String name, boolean gender, Date date, String phone) {
		// Khoi tao customer
		this.id = id;
		this.name = name;
		this.dateOfBirth = date;
		this.gender = gender;
		this.phone = phone;
		this.cart = new Cart();
		this.billsList = new ArrayList<Bill>();
	}

	public void addProductToShop(Product product, int qty) {
		// Them mot san pham vao shop cua customer		
		this.shop.addProduct(product, qty);
		product.setShop(shop);
	}
	
	

	public void registerShop(String shopName, String shopAddress) {
		// Khoi tao shop cua customer voi thong tin tren
		this.shop = new Shop(shopName, shopAddress);
	}

	public boolean addProductToCart(Product product, int qty) {
		// Them product vao gio hang (cart) voi san pham va so luong
		Shop shop = product.getShop();
		if (shop.checkQtyProduct(product, qty)) {
			this.cart.addProduct(product, qty);
			return true;
		}
		// Luu y voi truong hop het hang thi phai tra ve false (kiem tra so luong san
		// pham do trong shop < nums hay khong)
		return false;
	}

	
	
	public void buy(boolean traSau) {

		Map<Shop, Bill> shops = new HashMap<Shop, Bill>();

		for (Entry<Product, Integer> e : this.cart.getProducts().entrySet()) {
			Bill bill;
			if (!shops.containsKey(e.getKey().getShop())) {
				shops.put(e.getKey().getShop(), bill = new Bill());
				bill.add(e);
				// Thiet lap trang thai thanh toan/chua thanh toan cho hoa don
				if (traSau)
					bill.setStatus(Bill.CHUA_THANH_TOAN);
				else
					bill.setStatus(Bill.DA_THANH_TOAN);
				// Thiet lap giai doan cho hoa don
				bill.setPhase(Bill.XU_LY);
			} else {
				shops.get(e.getKey().getShop()).add(e);
			}

			// giam so luong san pham trong shop
			e.getKey().decreaseQty(e.getValue());
		}

		// them tung bill vao shop va customer
		for (Entry<Shop, Bill> e : shops.entrySet()) {
			e.getKey().addBill(e.getValue());
			addBill(e.getValue());
		}
		
		//bo sung
		
		//xoa hang trong gio hang
		cart.getProducts().clear();
	}
	private void addBill(Bill bill) {
		billsList.add(bill);
	}
	public void receiveProduct(Bill bill) {
		// Khach hang xac nhan da nhan duoc hang
		// Dieu chinh hoa don
		bill.setPhase(Bill.KET_THUC);
		bill.setStatus(Bill.DA_THANH_TOAN);

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Shop getShop() {
		// TODO Auto-generated method stub
		return this.shop;
	}

	public Cart getCart() {
		// TODO Auto-generated method stub
		return this.cart;
	}

	public static boolean isMale() {
		return MALE;
	}

	public static boolean isFemale() {
		return FEMALE;
	}

	public String getName() {
		return name;
	}

	public boolean isGender() {
		return gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getPhone() {
		return phone;
	}

	public List<Bill> getBillsList() {
		return billsList;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public void setBillsList(List<Bill> billsList) {
		this.billsList = billsList;
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
