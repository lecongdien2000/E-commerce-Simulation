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

public class AccountView extends JFrame{
	JTextField nameTxt;
	private JPanel pn1;
	JTextField dayTxt;
	JTextField monthTxt;
	JTextField yearTxt;
	private JLabel lblNewLabel_2;
	JTextField phoneTxt;
	JComboBox genderCmb;
	JButton confirmBtn, backBtn;
	public AccountView() {
		
		setBounds(100, 100, 450, 407);
		setVisible(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblHVTn = new JLabel("H\u1ECD v\u00E0 t\u00EAn");
		lblHVTn.setBounds(64, 64, 216, 63);
		getContentPane().add(lblHVTn);
		
		nameTxt = new JTextField();
		nameTxt.setBounds(149, 77, 216, 31);
		getContentPane().add(nameTxt);
		nameTxt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Gi\u1EDBi t\u00EDnh");
		lblNewLabel.setBounds(74, 127, 216, 63);
		getContentPane().add(lblNewLabel);
		
		String[] genderStr = {"Nam", "Nữ"};
		genderCmb = new JComboBox(genderStr);
		genderCmb.setBounds(149, 137, 216, 38);
		getContentPane().add(genderCmb);
		
		
		JLabel lblNewLabel_1 = new JLabel("Ng\u00E0y sinh");
		lblNewLabel_1.setBounds(64, 190, 68, 63);
		getContentPane().add(lblNewLabel_1);
		pn1 = new JPanel(new GridLayout(1,3));
		pn1.setBounds(149, 202, 216, 38);
		getContentPane().add(pn1);
		
		dayTxt = new JTextField();
		pn1.add(dayTxt);
		dayTxt.setColumns(10);
		
		monthTxt = new JTextField();
		pn1.add(monthTxt);
		monthTxt.setColumns(10);
		
		yearTxt = new JTextField();
		pn1.add(yearTxt);
		yearTxt.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Số điện thoại");
		lblNewLabel_2.setBounds(44, 253, 216, 63);
		getContentPane().add(lblNewLabel_2);
		
		phoneTxt = new JTextField();
		phoneTxt.setBounds(149, 266, 216, 38);
		getContentPane().add(phoneTxt);
		phoneTxt.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Thông tin cá nhân");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_3.setBounds(12, 13, 221, 38);
		getContentPane().add(lblNewLabel_3);
		
		confirmBtn = new JButton("Xác nhận");
		confirmBtn.setBounds(214, 322, 97, 25);
		getContentPane().add(confirmBtn);
		
		backBtn = new JButton("Trở về");
		backBtn.setBounds(323, 322, 97, 25);
		getContentPane().add(backBtn);
		
		setVisible(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
