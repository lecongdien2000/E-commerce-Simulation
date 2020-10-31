package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
public class RegisterShopView extends JFrame{
	

	
		JTextField nameTxt;
		private JLabel lblNewLabel_2;
		JTextField addressTxt;
		JButton confirmBtn, backBtn;
		public RegisterShopView() {
			
			setBounds(100, 100, 461, 331);
			setVisible(false);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			getContentPane().setLayout(null);
			
			JLabel lblHVTn = new JLabel("Tên Shop:");
			lblHVTn.setBounds(55, 77, 216, 63);
			getContentPane().add(lblHVTn);
			
			nameTxt = new JTextField();
			nameTxt.setBounds(152, 93, 216, 31);
			getContentPane().add(nameTxt);
			nameTxt.setColumns(10);
			
		
			
			lblNewLabel_2 = new JLabel("Địa chỉ:");
			lblNewLabel_2.setBounds(70, 135, 70, 63);
			getContentPane().add(lblNewLabel_2);
			
			addressTxt = new JTextField();
			addressTxt.setBounds(152, 151, 216, 31);
			getContentPane().add(addressTxt);
			addressTxt.setColumns(10);
			
			JLabel lblNewLabel_3 = new JLabel("Đăng ký Shop");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
			lblNewLabel_3.setBounds(26, 13, 221, 38);
			getContentPane().add(lblNewLabel_3);
			
			confirmBtn = new JButton("Xác nhận");
			confirmBtn.setBounds(214, 231, 97, 25);
			getContentPane().add(confirmBtn);
			
			backBtn = new JButton("Trở về");
			backBtn.setBounds(323, 231, 97, 25);
			getContentPane().add(backBtn);
			
		}
	

}
