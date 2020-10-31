package View;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class BillShopView extends JFrame {
	JButton backBtn, phaseBtn;
	JTextAreaItem billInfoTxt;
	private JTextField textField;
	public BillShopView() {
		getContentPane().setLayout(null);
		
		backBtn = new JButton(new ImageIcon("Picture/back.png"));
		
		backBtn.setBounds(27, 10, 74, 28);
		getContentPane().add(backBtn);
		
		JLabel label = new JLabel("Hóa đơn");
		label.setBounds(145, 14, 172, 18);
		getContentPane().add(label, BorderLayout.NORTH);
		
		JScrollPane scrollPaneBill = new JScrollPane();
		scrollPaneBill.setBounds(27, 79, 518, 236);
		getContentPane().add(scrollPaneBill);
		
		billInfoTxt = new JTextAreaItem();
		scrollPaneBill.setViewportView(billInfoTxt);
		
		phaseBtn = new JButton("Xác nhận");
		phaseBtn.setBounds(428, 321, 117, 29);
		getContentPane().add(phaseBtn);
		
		textField = new JTextField("Mã HD\tTênSP\tSL\tTổng giá\tTrạng thái\tGiai đoạn");
		textField.setBounds(27, 51, 518, 28);
		textField.setEditable(false);
		getContentPane().add(textField);
		setVisible(false);
		setSize(614,410);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
