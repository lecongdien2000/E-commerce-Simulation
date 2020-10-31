package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class AddProductView extends JFrame{
	JTextField nameTxt;
	JTextField priceTxt;
	JTextField qtyTxt;
	JButton backBtn, addBtn;
	public AddProductView() {
		getContentPane().setLayout(null);
		
		JLabel nameLbl = new JLabel("Tên sản phẩm:");
		nameLbl.setBounds(12, 41, 94, 24);
		getContentPane().add(nameLbl);
		
		nameTxt = new JTextField();
		nameTxt.setBounds(118, 42, 281, 23);
		getContentPane().add(nameTxt);
		nameTxt.setColumns(10);
		
		JLabel priceLbl = new JLabel("Giá:");
		priceLbl.setBounds(76, 93, 30, 24);
		getContentPane().add(priceLbl);
		
		priceTxt = new JTextField();
		priceTxt.setColumns(10);
		priceTxt.setBounds(118, 94, 281, 23);
		getContentPane().add(priceTxt);
		
		JLabel lblNewLabel = new JLabel("Số lượng:");
		lblNewLabel.setBounds(42, 147, 56, 16);
		getContentPane().add(lblNewLabel);
		
		qtyTxt = new JTextField();
		qtyTxt.setColumns(10);
		qtyTxt.setBounds(118, 144, 281, 23);
		getContentPane().add(qtyTxt);
		
		backBtn = new JButton("Trở về");
		backBtn.setBounds(302, 202, 97, 25);
		getContentPane().add(backBtn);
		
		addBtn = new JButton("Thêm");
		addBtn.setBounds(193, 202, 97, 25);
		getContentPane().add(addBtn);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(450, 300);
		setLocation(300,300);
		
	}
}
