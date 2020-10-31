package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainView extends JFrame{

	JPanel headingPn, centerPn, footerPn, pn1, pn2, pn3, pn4;
	JButton accountBtn, buyBtn, sellBtn, logOutBtn;
	JLabel nameLbl, buyLbl, sellLbl;
	public MainView() {
		this.setLayout(new BorderLayout());
		headingPn = new JPanel(new BorderLayout());
		this.add(headingPn,BorderLayout.NORTH);
		pn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		headingPn.add(pn1, BorderLayout.WEST);
		accountBtn = new JButton(new ImageIcon("Picture/account.png"));
		pn1.add(accountBtn);
		pn1.add(nameLbl = new JLabel());
		logOutBtn = new JButton(new ImageIcon("Picture/logout.png"));
		pn4 = new JPanel(new FlowLayout());
		headingPn.add(pn4,BorderLayout.EAST);
		pn4.add(logOutBtn);
		nameLbl.setFont (nameLbl.getFont ().deriveFont (32.0f)); //Chỉnh kích thước
		
		
		centerPn = new JPanel(new GridLayout(1,2));
		this.add(centerPn, BorderLayout.CENTER);
		buyBtn = new JButton(new ImageIcon("Picture/buy.png"));
		centerPn.add(buyBtn);
		sellBtn = new JButton(new ImageIcon("Picture/sell.png"));
		centerPn.add(sellBtn);
		
		footerPn = new JPanel(new GridLayout(1,2));
		this.add(footerPn, BorderLayout.SOUTH);
		pn2 = new JPanel(new GridBagLayout());
		pn3 = new JPanel(new GridBagLayout());
		footerPn.add(pn2);
		footerPn.add(pn3);
		pn2.add(buyLbl = new JLabel("Mua hàng"));
		pn3.add(sellLbl = new JLabel("Bán hàng"));
		
		buyLbl.setFont (nameLbl.getFont ().deriveFont (16.0f)); 
		sellLbl.setFont (nameLbl.getFont ().deriveFont (16.0f)); 
		
		setVisible(false);
		setSize(500,300);
		setLocation(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
