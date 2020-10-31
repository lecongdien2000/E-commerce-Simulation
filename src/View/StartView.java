package View;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StartView extends JFrame{

	JTextField idTxt;
	JLabel headerLbl, noteLbl, notifLbl;
	JButton loginBtn, signupBtn;
	JPanel contentPn, botPn; //panel giữa, panel dưới
	JPanel pn1, pn2, pn3, pn4; //các panel tạm
	public StartView() {
		this.setLayout(new BorderLayout()); //Layout chính
		pn2 = new JPanel(new GridBagLayout());
		this.add(pn2,BorderLayout.NORTH);
		pn2.add(headerLbl = new JLabel("Chào mừng quý khách đến với website thương mại điện tử Tadi"));
		headerLbl.setFont (headerLbl.getFont ().deriveFont (16.0f)); //Chỉnh kích thước
		this.add(contentPn = new JPanel(new BorderLayout()), BorderLayout.CENTER);
		
		pn3 = new JPanel(new GridBagLayout()); 
		contentPn.add(pn3,BorderLayout.NORTH);
		pn3.add(noteLbl = new JLabel("Mời quý khách nhập mã ID khách hàng."));
		pn1 = new JPanel(new GridBagLayout());
		contentPn.add(pn1,BorderLayout.CENTER);
		pn1.add(idTxt = new JTextField(20));
		pn4 = new JPanel(new GridBagLayout()); 
		contentPn.add(pn4,BorderLayout.SOUTH);
		pn4.add(notifLbl = new JLabel(""));
		
		botPn = new JPanel(new GridLayout(2,1));
		this.add(botPn,BorderLayout.SOUTH);
		botPn.add(loginBtn = new JButton("Đăng nhập"));
		botPn.add(signupBtn = new JButton("Đăng ký"));
		
		setSize(600, 300);
		setTitle("Hệ thống bán hàng điện tử Tadi");
		setVisible(true);
		setLocation(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
}
