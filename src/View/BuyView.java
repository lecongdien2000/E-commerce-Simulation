package View;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import Model.Product;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class BuyView extends JFrame{
	JPanel pn1, pn2;
	JButton chooseBtn, backBtn, cartBtn, billBtn, searchBtn;
	JTextAreaItem productInfoTxt;
	private JTextField labelTxt;
	int cartQty = 0, billQty = 0;
	JTextField searchTxt;
	 JButton nameUpBtn;
	 JButton nameDownBtn;
	 JButton priceUpBtn;
	 JButton priceDownBtn;
	public BuyView() {
		getContentPane().setLayout(null);
		
		backBtn = new JButton("<-");
		backBtn.setBounds(0, 0, 47, 25);
		getContentPane().add(backBtn);
		
		cartBtn = new JButton("Giỏ (0)");
		cartBtn.setBounds(52, 30, 94, 25);
		getContentPane().add(cartBtn);
		
		billBtn = new JButton("Đơn (0)");
		billBtn.setBounds(151, 30, 77, 25);
		getContentPane().add(billBtn);
		
		productInfoTxt = new JTextAreaItem();
		productInfoTxt.setBounds(52, 85, 444, 149);
		getContentPane().add(productInfoTxt);
		
		chooseBtn = new JButton("Chọn");
		chooseBtn.setBounds(477, 239, 61, 25);
		getContentPane().add(chooseBtn);
		
		labelTxt = new JTextField("Mã\tTên\tShop\tGiá");
		labelTxt.setBounds(52, 61, 444, 25);
		labelTxt.setEditable(false);
		getContentPane().add(labelTxt);
		labelTxt.setColumns(10);
		
		searchTxt = new JTextField();
		searchTxt.setBounds(325, 30, 134, 24);
		getContentPane().add(searchTxt);
		searchTxt.setColumns(10);
		
		searchBtn = new JButton(new ImageIcon("Picture/search.png"));
		searchBtn.setBounds(462, 30, 37, 25);
		getContentPane().add(searchBtn);
		
		nameUpBtn = new JButton("Tăng: Tên");
		nameUpBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		nameUpBtn.setBounds(52, 239, 97, 25);
		getContentPane().add(nameUpBtn);
		
		nameDownBtn = new JButton("Giảm: Tên");
		nameDownBtn.setBounds(151, 239, 97, 25);
		getContentPane().add(nameDownBtn);
		
		priceUpBtn = new JButton("Tăng: Giá");
		priceUpBtn.setBounds(249, 239, 97, 25);
		getContentPane().add(priceUpBtn);
		
		priceDownBtn = new JButton("Giảm: Giá");
		priceDownBtn.setBounds(346, 239, 97, 25);
		getContentPane().add(priceDownBtn);
		
		setVisible(false);
		setSize(556, 311);
		setTitle("Mua hàng");
		setResizable(false);
		setLocation(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	public void resetProductInfoTxt(List<Product> products) {
		productInfoTxt.setText("");
		for(Product product: products) {
			List<String> item = new ArrayList<String>();
			item.add(product.getId());
			item.add(product.getName());
			item.add(product.getShop().getName());
			item.add(product.getPrice()+"");
			this.productInfoTxt.addItem(item);
		}
	}
}
