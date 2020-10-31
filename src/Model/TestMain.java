//package Model;
//
//public class TestMain {
//	public static void main(String[] args) {
//		ECSystem ecSystem = new ECSystem();
//
//		Customer kh1 = new Customer(ecSystem.createCustomerID(), "Nguyen Van A", Customer.MALE, new Date(2, 2, 1995),
//				"012434434");
//		ecSystem.addCustomer(kh1);
//
//		Customer kh2 = new Customer(ecSystem.createCustomerID(), "Nguyen Thi B", Customer.FEMALE, new Date(2, 2, 1995),
//				"012434334");
//		ecSystem.addCustomer(kh2);
//
//
//		Customer c1 = ecSystem.getCustomer("KH0");
//		c1.registerShop("TGDD", "Dia chi");
//
//		Product sp1 = new Product(ecSystem.createProductID(), "Laptop Macbook Air", 2500);
//		c1.addProductToShop(sp1, 2);
//		Product sp2 = new Product(ecSystem.createCustomerID(), "Macbook Pro", 12);
//		c1.addProductToShop(sp2, 1);
//
//
//		Shop shop1 = c1.getShop();
//		shop1.getProducts();
//
//		Customer c2 = ecSystem.getCustomer("KH1");
//		c2.registerShop("Dien may xanh", "Dia chi");
//
//
//		c2.addProductToCart(sp1, 2);
//		c2.addProductToCart(sp2, 1);
//
//
//		c2.buy(true);
//		c2.buy(false);
//		
//		
//	}
//
//}
