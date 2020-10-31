package View;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class BillBuyView extends JFrame {
	JButton backBtn, statusBtn;
	JTextAreaItem billInfoTxt;
	private JTextField textField;

	public BillBuyView() {
		getContentPane().setLayout(null);

		backBtn = new JButton(new ImageIcon("Picture/back.png"));
		backBtn.setBounds(27, 10, 74, 28);
		getContentPane().add(backBtn);

		JLabel label = new JLabel("Hóa đơn");
		label.setBounds(145, 14, 172, 18);
		getContentPane().add(label, BorderLayout.NORTH);

		JScrollPane scrollPaneBill = new JScrollPane();
		scrollPaneBill.setBounds(27, 82, 516, 233);
		getContentPane().add(scrollPaneBill);

		billInfoTxt = new JTextAreaItem();
		scrollPaneBill.setViewportView(billInfoTxt);

		statusBtn = new JButton("Ký nhận");
		statusBtn.setBounds(426, 328, 117, 29);
		getContentPane().add(statusBtn);
		
		textField = new JTextField("Mã HD\tTênSP\tSL\tTổng giá\tTrạng thái\tGiai đoạn");
		textField.setEditable(false);
		textField.setBounds(27, 51, 516, 28);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		setVisible(false);
		setSize(604, 410);
		setLocation(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
