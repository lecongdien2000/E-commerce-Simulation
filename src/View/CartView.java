package View;

import java.awt.BorderLayout;


import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JScrollPane;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CartView extends JFrame{
JLabel cartLbl;
JButton backBtn, buyBtn;
JRadioButton rdbtnTraSau, rdbtnTraTruoc;
JTextAreaItem cartTxt;
private JTextField textField;
	
	public CartView() {
		getContentPane().setLayout(null);
		
		backBtn = new JButton(new ImageIcon("Picture/back.png"));
		backBtn.setBounds(27, 10, 74, 28);
		getContentPane().add(backBtn);
		
		cartLbl = new JLabel("Giao hàng");
		cartLbl.setBounds(145, 14, 172, 18);
		getContentPane().add(cartLbl, BorderLayout.NORTH);
		
		JScrollPane scrollPaneBill = new JScrollPane();
		scrollPaneBill.setBounds(27, 77, 298, 238);
		getContentPane().add(scrollPaneBill);
		
		cartTxt = new JTextAreaItem();
		scrollPaneBill.setViewportView(cartTxt);
		
		buyBtn = new JButton("Đặt mua");
		buyBtn.setBounds(209, 366, 117, 29);
		getContentPane().add(buyBtn);
		
		rdbtnTraSau = new JRadioButton("Trả sau");
		rdbtnTraSau.setBounds(156, 324, 74, 23);
		getContentPane().add(rdbtnTraSau);
		
		rdbtnTraTruoc = new JRadioButton("Trả trước");
		rdbtnTraTruoc.setBounds(234, 324, 83, 23);
		getContentPane().add(rdbtnTraTruoc);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnTraTruoc);
		buttonGroup.add(rdbtnTraSau);
		
		textField = new JTextField("Mã\tTên\tGiá\tSL");
		textField.setBounds(27, 49, 298, 28);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		setVisible(false);
		setSize(367,449);
		setLocation(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
