package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DeleteProductView extends JFrame {
	JTextField idTxt;
	JButton confirmBtn, backBtn;
	public DeleteProductView() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập mã SP muốn xóa");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(12, 13, 189, 23);
		getContentPane().add(lblNewLabel);
		
		idTxt = new JTextField();
		idTxt.setBounds(55, 49, 321, 23);
		getContentPane().add(idTxt);
		idTxt.setColumns(10);
		
		confirmBtn = new JButton("Xác nhận");
		confirmBtn.setBounds(169, 100, 97, 25);
		getContentPane().add(confirmBtn);
		
		backBtn = new JButton("Trở về");
		backBtn.setBounds(278, 100, 97, 25);
		getContentPane().add(backBtn);
	
		
		setVisible(false);
		setSize(450,190);
		setLocation(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
