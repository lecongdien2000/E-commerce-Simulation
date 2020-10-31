package View;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ShopView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton backBtn, addBtn, deleteBtn;
	JLabel shopNameLabel;
	JTextAreaItem productInfoTxt;
	JButton billBtn;
	DefaultListModel<String> modelList;
	
	public ShopView() {
		getContentPane().setLayout(null);
		
		backBtn = new JButton(new ImageIcon("Picture/back.png"));
		
		backBtn.setBounds(33, 6, 74, 28);
		getContentPane().add(backBtn);
		
		
		shopNameLabel = new JLabel("Shop Name");
		shopNameLabel.setFont (shopNameLabel.getFont ().deriveFont (16.0f)); 
		shopNameLabel.setBounds(134, 10, 172, 18);
		getContentPane().add(shopNameLabel);
		
		addBtn = new JButton(new ImageIcon("Picture/add.png"));
	
		addBtn.setBounds(33, 40, 74, 29);
		getContentPane().add(addBtn);
		
		deleteBtn = new JButton(new ImageIcon("Picture/remove.png"));

		deleteBtn.setBounds(144, 40, 66, 29);
		getContentPane().add(deleteBtn);
		
		modelList = new DefaultListModel<>();
		
		billBtn = new JButton(new ImageIcon("Picture/bill.png"));
		billBtn.setBounds(366, 6, 85, 29);
		getContentPane().add(billBtn);
		
		JTextField textField = new JTextField("Mã\tTên\tSL\tGiá");
		textField.setBounds(33, 82, 418, 28);
		textField.setEditable(false);
		getContentPane().add(textField);
		
		productInfoTxt = new JTextAreaItem();
		productInfoTxt.setBounds(33, 111, 418, 168);
		productInfoTxt.setEditable(false);
		getContentPane().add(productInfoTxt);
		
		setVisible(false);
		setSize(498,378);
		setLocation(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
