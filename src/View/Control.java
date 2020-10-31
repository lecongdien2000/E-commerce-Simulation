package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Model.*;
import Model.Customer;
import Model.Date;
import Model.Product;

public class Control {
	InterfaceSystem adapterSystem; // Model
	// ---View----
	StartView startView;
	RegisterView registerView;
	MainView mainView;
	AccountView accountView;
	BuyView buyView;
	ShopView shopView;
	RegisterShopView registerShopView;
	AddProductView addProductView;
	DeleteProductView deleteProductView;
	AddToCartView addToCartView;
	CartView cartView;
	BillBuyView billBuyView;
	BillShopView billShopView;
	// -------
	AutoGeneration autoGeneration;
	public Control() {
		adapterSystem = new MySystem();
		startView = new StartView();
		registerView = new RegisterView();
		mainView = new MainView();
		accountView = new AccountView();
		buyView = new BuyView();
		shopView = new ShopView();
		registerShopView = new RegisterShopView();
		addProductView = new AddProductView();
		deleteProductView = new DeleteProductView();
		addToCartView = new AddToCartView();
		cartView = new CartView();
		billBuyView = new BillBuyView();
		billShopView = new BillShopView();
		autoGeneration = new AutoGeneration();
		startViewAction();
		registerViewAction();
		mainViewAction();
		accountViewAction();
		buyViewAction();
		registerShopViewAction();
		shopViewAction();
		addProductViewAction();
		deleteProductViewAction();
		addToCartViewAction();
		cartViewAction();
		billBuyViewAction();
		billShopViewAction();
		autoGenerationAction();
	}

	private void autoGenerationAction() {
		autoGeneration.user1Btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				registerView.nameTxt.setText("Nguyễn Văn Hưng");
				registerView.dayBirthTxt.setText("16");
				registerView.genderCmb.setSelectedIndex(0);
				registerView.monthBirthTxt.setText("03");
				registerView.yearBirthTxt.setText("1998");
				registerView.phoneTxt.setText("0298992675");
			}
		});
		autoGeneration.user2Btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				registerView.nameTxt.setText("Nguyễn Thị Lý");
				registerView.dayBirthTxt.setText("29");
				registerView.genderCmb.setSelectedIndex(1);
				registerView.monthBirthTxt.setText("08");
				registerView.yearBirthTxt.setText("1995");
				registerView.phoneTxt.setText("0829332456");
			}
		});
		
		autoGeneration.pro11Btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				addProductView.nameTxt.setText("Samsung");
				addProductView.priceTxt.setText("200000");
				addProductView.qtyTxt.setText("20");
			}
		});
		autoGeneration.pro21Btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				addProductView.nameTxt.setText("Oppo");
				addProductView.priceTxt.setText("300000");
				addProductView.qtyTxt.setText("30");
			}
		});
		autoGeneration.pro31Btn.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		addProductView.nameTxt.setText("IPhone");
		addProductView.priceTxt.setText("500000");
		addProductView.qtyTxt.setText("10");
	}
});
		autoGeneration.shop1Btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				registerShopView.nameTxt.setText("Điện thoại Phong Vũ");
				registerShopView.addressTxt.setText("KP5-Q.Bình Thạnh-TPHCM");
				
			}
		});
		autoGeneration.shop2Btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				registerShopView.nameTxt.setText("Quán ăn Kim Thanh");
				registerShopView.addressTxt.setText("P.An Bình-Dĩ An-Bình Dương");
			}
		});
		
autoGeneration.pro12Btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				addProductView.nameTxt.setText("Vịt nướng");
				addProductView.priceTxt.setText("1000");
				addProductView.qtyTxt.setText("50");
			}
		});
autoGeneration.pro22Btn.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		addProductView.nameTxt.setText("Vịt luộc");
		addProductView.priceTxt.setText("15000");
		addProductView.qtyTxt.setText("100");
	}
});
autoGeneration.pro32Btn.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		addProductView.nameTxt.setText("Gà luộc");
		addProductView.priceTxt.setText("13000");
		addProductView.qtyTxt.setText("20");
	}
});
	}

	private void billShopViewAction() {
		addBackActionListener(billShopView.backBtn, billShopView, shopView);
		billShopView.phaseBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog(billShopView, "Nhập ID hóa đơn", "Xử lý đơn hàng",
						JOptionPane.INFORMATION_MESSAGE);
				Bill bill = adapterSystem.getCurrentCustomer().getShop().getBill(id);
				if (bill.getPhase() == Bill.XU_LY) {
					adapterSystem.getCurrentCustomer().getShop().getBill(id).setPhase(Bill.VAN_CHUYEN);
					billShopView.billInfoTxt
							.reDrawWithBillsType(adapterSystem.getCurrentCustomer().getShop().getBillsList());
					JOptionPane.showMessageDialog(null, "Đã thực hiện!");
				} else
					JOptionPane.showMessageDialog(null, "Không thực hiện được!");
			}
		});
	}

	private void billBuyViewAction() {
		addBackActionListener(billBuyView.backBtn, billBuyView, buyView);
		billBuyView.statusBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog(billShopView, "Nhập ID hóa đơn", "Ký nhận đơn hàng",
						JOptionPane.INFORMATION_MESSAGE);
				Bill bill = adapterSystem.getCurrentCustomer().getBill(id);
				if (bill.getPhase() == Bill.VAN_CHUYEN) {
					adapterSystem.getCurrentCustomer().receiveProduct(bill);
					billBuyView.billInfoTxt.reDrawWithBillsType(adapterSystem.getCurrentCustomer().getBillsList());
					JOptionPane.showMessageDialog(null, "Đã thực hiện!");
				} else
					JOptionPane.showMessageDialog(null, "Không thực hiện được!");
			}
		});

	}

	private void addBackActionListener(JButton button, JFrame frameFrom, JFrame frameTo) {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frameFrom.setVisible(false);
				frameTo.setVisible(true);
			}
		});
	}

	private void cartViewAction() {
		addBackActionListener(cartView.backBtn, cartView, buyView);
		cartView.buyBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				adapterSystem.getCurrentCustomer().buy(cartView.rdbtnTraSau.isSelected());
				cartView.cartTxt.setText("");
				JOptionPane.showMessageDialog(cartView, "Mua hàng thành công!");
				buyView.cartBtn.setText("Giỏ(0)");
				// Ve tren hoa don cua mua hang
				billBuyView.billInfoTxt.reDrawWithBillsType(adapterSystem.getCurrentCustomer().getBillsList());
			}
		});

	}

	private void addToCartViewAction() {
		addBackActionListener(addToCartView.backBtn, addToCartView, buyView);
		addToCartView.confirmBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Product product = adapterSystem.findProductByID(addToCartView.idTxt.getText());
				int qty = Integer.parseInt(addToCartView.qtyTxt.getText());
				// Kiểm tra có đủ số lượng sản phẩm để mua không
				if (product.getQty() < qty) {
					JOptionPane.showMessageDialog(addToCartView, "Sản phẩm chỉ còn " + product.getQty() + " cái!");
					return;
				}
				adapterSystem.getCurrentCustomer().addProductToCart(product, qty);

				List<String> text = new ArrayList<String>();
				text.add(product.getId());
				text.add(product.getName());
				text.add(product.getPrice() + "");
				text.add(qty + "");
				// Thêm sản phẩm hiển thị ở cart
				cartView.cartTxt.addItem(text);
				// chỉnh nút
				buyView.cartQty += qty;
				buyView.cartBtn.setText("Giỏ (" + buyView.cartQty + ")");
				// Reset lại
				addToCartView.idTxt.setText("");
				addToCartView.qtyTxt.setText("");
				// Show thông báo
				JOptionPane.showMessageDialog(addToCartView, "Thêm thành công!");
				// Vẽ lại shop View với trường hợp shop tự mua chính mình
				if (product.getShop().equals(adapterSystem.getCurrentCustomer().getShop()))
					shopView.productInfoTxt
							.reDrawWithProductType(adapterSystem.getCurrentCustomer().getShop().getProducts());
			}
		});

	}

	private void deleteProductViewAction() {
		addBackActionListener(deleteProductView.backBtn, deleteProductView, shopView);
		deleteProductView.confirmBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Lay ma sp tu field ra
				String id = deleteProductView.idTxt.getText();
				deleteProductView.idTxt.setText("");
				// Tim trong product cua customer, xoa di cai product do
				adapterSystem.removeProductShopView(id);
				// Tim trong product cua system, xoa di product do
				adapterSystem.removeProductBuyView(id);
				// Xoa hien thi trong he thong
				shopView.productInfoTxt.deleteItem(id);
				// Xoa san pham trong danh sach mat hang
				buyView.productInfoTxt.deleteItem(id);
				// Thong bao da xoa thanh cong
				JOptionPane.showMessageDialog(deleteProductView, "Xóa thành công!");
			}
		});

	}

	private void addProductViewAction() {
		addBackActionListener(addProductView.backBtn, addProductView, shopView);
		addProductView.addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Thêm sản phẩm bán vào product list
				String name = addProductView.nameTxt.getText();
				double price = Double.parseDouble(addProductView.priceTxt.getText());
				int qty = Integer.parseInt(addProductView.qtyTxt.getText());
				Product product;
				adapterSystem.getCurrentCustomer()
						.addProductToShop(product = new Product(adapterSystem.getProductID(), name, price), qty);
				adapterSystem.addProduct(product);
				JOptionPane.showMessageDialog(addProductView, "Thêm thành công");
				// Reset các field nhập
				addProductView.nameTxt.setText("");
				addProductView.priceTxt.setText("");
				addProductView.qtyTxt.setText("");
				// Hiển thị shop
				List<String> entry = new ArrayList<String>();
				entry.add(product.getId());
				entry.add(name);
				entry.add(qty + "");
				entry.add(price + "");
				shopView.productInfoTxt.addItem(entry);
				// Hiển thị cho người mua
				List<String> entry2 = new ArrayList<String>();
				entry2.add(product.getId());
				entry2.add(name);
				entry2.add(product.getShop().getName());
				entry2.add(price + "");
				buyView.productInfoTxt.addItem(entry2);
			}
		});

	}

	private void shopViewAction() {
		// Action cua shop View
		addBackActionListener(shopView.backBtn, shopView, mainView);
		shopView.addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				shopView.setVisible(false);
				addProductView.setVisible(true);

			}
		});
		shopView.deleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				shopView.setVisible(false);
				deleteProductView.setVisible(true);
			}
		});
		shopView.billBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				shopView.setVisible(false);
				billShopView.setVisible(true);
			}
		});
	}

	private void registerShopViewAction() {
		addBackActionListener(registerShopView.backBtn, registerShopView, mainView);
		registerShopView.confirmBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = registerShopView.nameTxt.getText();
				String address = registerShopView.addressTxt.getText();
				adapterSystem.getCurrentCustomer().registerShop(name, address);
				registerShopView.nameTxt.setText("");
				registerShopView.addressTxt.setText("");
				JOptionPane.showMessageDialog(registerShopView, "Đăng ký thành công! ");
				registerShopView.setVisible(false);
				mainView.setVisible(true);

				shopView.shopNameLabel.setText(name);
				Map<Product, Integer> products = adapterSystem.getCurrentCustomer().getShop().getProducts();
				for (Product product : products.keySet()) {
					shopView.modelList
							.addElement(product.getName() + "\t" + products.get(product) + "\t" + product.getPrice());
				}

			}
		});

	}

	private void buyViewAction() {
		addBackActionListener(buyView.backBtn, buyView, mainView);
		buyView.chooseBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				buyView.setVisible(false);
				addToCartView.setVisible(true);
			}
		});

		buyView.cartBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				buyView.setVisible(false);
				cartView.setVisible(true);
			}
		});
		buyView.billBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				buyView.setVisible(false);
				billBuyView.setVisible(true);
			}
		});
		buyView.searchBtn.addActionListener(searchActionListener());

		buyView.searchTxt.addActionListener(searchActionListener());
		
		buyView.nameUpBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				buyView.resetProductInfoTxt(adapterSystem.sortProductIncreaseByName());
			}
		});
		buyView.nameDownBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				buyView.resetProductInfoTxt(adapterSystem.sortProductDecreaseByName());
			}
		});
		buyView.priceUpBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				buyView.resetProductInfoTxt(adapterSystem.sortProductIncreaseByPrice());
			}
		});
		buyView.priceDownBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				buyView.resetProductInfoTxt(adapterSystem.sortProductDecreaseByPrice());
			}
		});
	}
	private ActionListener searchActionListener() {
		return new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				buyView.productInfoTxt.setText("");
				List<Product> products;
				if(buyView.searchTxt.getText().equals("")) 
					products = adapterSystem.getProducts();
				else products = adapterSystem.findProductByName(buyView.searchTxt.getText());
				buyView.resetProductInfoTxt(products);
			}
			
		};
	}

	
	
	private void accountViewAction() {
		addBackActionListener(accountView.backBtn, accountView, mainView);
		accountView.confirmBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog(accountView,
						"Bạn có chắc muốn thay đổi thông tin không?", "chỉnh sửa", dialogButton);
				if (dialogResult == JOptionPane.YES_OPTION) {
					adapterSystem.getCurrentCustomer().setName(accountView.nameTxt.getText());
					adapterSystem.getCurrentCustomer().setGender(
							accountView.genderCmb.getSelectedItem().equals("Nam") ? Customer.MALE : Customer.FEMALE);
					int day = Integer.parseInt(accountView.dayTxt.getText());
					int month = Integer.parseInt(accountView.monthTxt.getText());
					int year = Integer.parseInt(accountView.yearTxt.getText());
					adapterSystem.getCurrentCustomer().setDateOfBirth(new Date(day, month, year));
					adapterSystem.getCurrentCustomer().setPhone(accountView.phoneTxt.getText());

					mainView.nameLbl.setText(adapterSystem.getCurrentCustomer().getName());
					mainView.setTitle("Hệ thống Tadi - " + adapterSystem.getCurrentCustomer().getName());
				}

			}
		});

	}

	private void mainViewAction() {
		mainView.logOutBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog(mainView, "Bạn có chắc muốn đăng xuất không?",
						"Đăng xuất", dialogButton);
				if (dialogResult == JOptionPane.YES_OPTION) {
					adapterSystem.setCurrentCustomer(null);
					mainView.setVisible(false);
					startView.setVisible(true);
					shopView.productInfoTxt.setText("");
					cartView.cartTxt.setText("");

				}

			}
		});

		mainView.accountBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				accountView.setVisible(true);
				mainView.setVisible(false);

			}
		});

		mainView.buyBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				mainView.setVisible(false);
				buyView.setVisible(true);

			}
		});
		mainView.sellBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (adapterSystem.getCurrentCustomer().getShop() == null) {
					int dialogButton = JOptionPane.YES_NO_OPTION;
					int dialogResult = JOptionPane.showConfirmDialog(mainView, "Bạn chưa có shop. Tạo ngay!",
							"Thông báo", dialogButton);
					if (dialogResult == JOptionPane.YES_OPTION) {
						// Chuyen sang sellview
						registerShopView.setVisible(true);
						mainView.setVisible(false);
					}
				} else {
					mainView.setVisible(false);
					shopView.setVisible(true);
				}

			}
		});
	}

	public void startViewAction() {
		// Nhap id enter
		startView.idTxt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loginActionPerformed();
			}
		});
		// An nut login
		startView.loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loginActionPerformed();
			}
		});
		// An nut signup
		startView.signupBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Chuyển sang cửa sổ đăng ký
				startView.setVisible(false);
				registerView.setVisible(true);
			}
		});
	}

	public void registerViewAction() {
		// An nut tro ve
		addBackActionListener(registerView.backBtn, registerView, startView);
		// An nut dang ky
		registerView.registerBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = registerView.nameTxt.getText();
				String gender = ((String) registerView.genderCmb.getSelectedItem());
				int day = Integer.parseInt((String) registerView.dayBirthTxt.getText());
				int month = Integer.parseInt((String) registerView.monthBirthTxt.getText());
				int year = Integer.parseInt((String) registerView.yearBirthTxt.getText());
				String phone = registerView.phoneTxt.getText();

				String id = adapterSystem.registerCustomerToSystem(name, gender, day, month, year, phone);
				JOptionPane.showMessageDialog(registerView, "Đăng ký thành công\n Mã khách hàng của bạn là " + id);

				registerView.nameTxt.setText("");
				registerView.genderCmb.setSelectedIndex(0);
				registerView.dayBirthTxt.setText("");
				registerView.monthBirthTxt.setText("");
				registerView.yearBirthTxt.setText("");
				registerView.phoneTxt.setText("");
			}
		});
	}

	private void loginActionPerformed() {
		String id = startView.idTxt.getText();
		if (adapterSystem.isValidID(id)) {
			Customer customer;
			adapterSystem.setCurrentCustomer(customer = adapterSystem.getCustomer(id));
			startView.idTxt.setText("");
			// Login thành công. Chuyển cửa sổ chính
			this.startView.setVisible(false);
			this.mainView.setVisible(true);
			this.mainView.setTitle("Hệ thống Tadi - " + customer.getName());
			this.mainView.nameLbl.setText(customer.getName());
			// Chỉnh sửa thông tin ở AccountView
			this.accountView.nameTxt.setText(customer.getName());
			if (customer.isGender() == customer.MALE) {
				this.accountView.genderCmb.setSelectedIndex(0);
			} else
				this.accountView.genderCmb.setSelectedIndex(1);
			Date date = customer.getDateOfBirth();
			this.accountView.dayTxt.setText(date.getDay() + "");
			this.accountView.monthTxt.setText(date.getMonth() + "");
			this.accountView.yearTxt.setText(date.getYear() + "");
			this.accountView.phoneTxt.setText(customer.getPhone());
			// Vẽ lại cart
			cartView.cartTxt.reDrawWithProductType(customer.getCart().getProducts());
			billBuyView.billInfoTxt.reDrawWithBillsType(customer.getBillsList());
			buyView.cartBtn.setText("Giỏ (" + customer.getCart().getProducts().size() + ")");
			// Chỉnh sửa thông tin product của shop
			if (customer.getShop() != null) {
				shopView.productInfoTxt.reDrawWithProductType(customer.getShop().getProducts());
				// Vẽ lại hóa đơn bán hàng
				billShopView.billInfoTxt.reDrawWithBillsType((customer.getShop().getBillsList()));
			} else
				shopView.productInfoTxt.setText("");
			//Chỉnh sửa thông tin product ở buyView
			buyView.searchTxt.setText("");
			buyView.resetProductInfoTxt(adapterSystem.getProducts());
		} else {
			JOptionPane.showMessageDialog(startView, "Không tồn tại ID khách hàng này!");
			this.startView.idTxt.setText("");
		}
	}

	public static void main(String[] args) {
		Control control = new Control();
	}
}
