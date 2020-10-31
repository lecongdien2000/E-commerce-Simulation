package View;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegisterView extends JFrame {
	JPanel centerPn, leftPn, bottomPn;
	JPanel pn1,pn2,pn3;
	JLabel titleLbl, nameLbl, genderLbl, birthLbl, phoneLbl;
	JTextField nameTxt, dayBirthTxt, monthBirthTxt, yearBirthTxt, phoneTxt;
	JComboBox<String> genderCmb;
	JButton registerBtn, backBtn;
	public RegisterView() {
		this.setLayout(new BorderLayout());
		pn1 = new JPanel(new GridBagLayout()); 
		this.add(pn1,BorderLayout.NORTH);
		pn1.add(titleLbl = new JLabel("Đăng ký"));
		titleLbl.setFont (titleLbl.getFont ().deriveFont (16.0f)); //Chỉnh kích thước
		
		centerPn = new JPanel(new GridLayout(4,1));
		this.add(centerPn,BorderLayout.CENTER);
		centerPn.add(nameTxt = new JTextField());
		String[] genderString = {"Nam", "Nữ"};
		genderCmb = new JComboBox<String>(genderString);
		centerPn.add(genderCmb);
		pn2 = new JPanel(new GridLayout(1,3));
		centerPn.add(pn2);
		pn2.add(dayBirthTxt = new JTextField());
		pn2.add(monthBirthTxt = new JTextField());
		pn2.add(yearBirthTxt = new JTextField());
		centerPn.add(phoneTxt = new JTextField());
		

		leftPn = new JPanel(new GridLayout(4,1));
		this.add(leftPn,BorderLayout.WEST);
		leftPn.add(nameLbl = new JLabel("Tên"));
		leftPn.add(genderLbl = new JLabel("Giới tính"));
		leftPn.add(birthLbl = new JLabel("Ngày sinh"));
		leftPn.add(phoneLbl = new JLabel("Sđt"));
		
		bottomPn = new JPanel(new BorderLayout());
		pn3 = new JPanel(new GridLayout(1,2));
		pn3.add(registerBtn = new JButton("Đăng ký"));
		pn3.add(backBtn = new JButton("Trở lại"));
		this.add(bottomPn,BorderLayout.SOUTH);
		bottomPn.add(pn3,BorderLayout.EAST);
		
		
		
		setVisible(false);
		setSize(600, 300);
		setTitle("Đăng ký");
		setLocation(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
