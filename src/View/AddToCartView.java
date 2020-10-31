package View;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddToCartView extends JFrame{
	JTextField idTxt;
	JButton confirmBtn, backBtn;
	JTextField qtyTxt;
	public AddToCartView() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã SP");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(12, 13, 189, 23);
		getContentPane().add(lblNewLabel);
		
		idTxt = new JTextField();
		idTxt.setBounds(55, 49, 321, 23);
		getContentPane().add(idTxt);
		idTxt.setColumns(10);
		
		confirmBtn = new JButton("Xác nhận");
		confirmBtn.setBounds(170, 202, 97, 25);
		getContentPane().add(confirmBtn);
		
		backBtn = new JButton("Trở về");
		backBtn.setBounds(279, 202, 97, 25);
		getContentPane().add(backBtn);
		
		JLabel lblSLng = new JLabel("Số lượng");
		lblSLng.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSLng.setBounds(12, 109, 189, 23);
		getContentPane().add(lblSLng);
		
		qtyTxt = new JTextField();
		qtyTxt.setColumns(10);
		qtyTxt.setBounds(55, 145, 321, 23);
		getContentPane().add(qtyTxt);
	
		
		setVisible(false);
		setSize(450,287);
		setLocation(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
