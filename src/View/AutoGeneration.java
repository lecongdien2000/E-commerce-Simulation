package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AutoGeneration extends JFrame {
	JButton user1Btn, user2Btn, pro11Btn, pro21Btn, pro31Btn, pro12Btn, pro22Btn, pro32Btn, shop1Btn, shop2Btn;

	public AutoGeneration() {

		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(300, 500);
		setResizable(false);
		setLocation(1200, 200);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("User");
		lblNewLabel.setBounds(12, 13, 56, 16);
		getContentPane().add(lblNewLabel);

		user1Btn = new JButton("User 1");
		user1Btn.setBounds(22, 42, 97, 25);
		getContentPane().add(user1Btn);

		user2Btn = new JButton("User 2");
		user2Btn.setBounds(169, 42, 97, 25);
		getContentPane().add(user2Btn);

		JLabel lblNewLabel_1 = new JLabel("Product");
		lblNewLabel_1.setBounds(12, 169, 56, 16);
		getContentPane().add(lblNewLabel_1);

		pro11Btn = new JButton("Product 1");
		pro11Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		pro11Btn.setBounds(22, 198, 97, 25);
		getContentPane().add(pro11Btn);

		pro21Btn = new JButton("Product 2");
		pro21Btn.setBounds(22, 266, 97, 25);
		getContentPane().add(pro21Btn);

		pro31Btn = new JButton("Product 3");
		pro31Btn.setBounds(22, 330, 97, 25);
		getContentPane().add(pro31Btn);

		pro12Btn = new JButton("Product 1");

		pro12Btn.setBounds(169, 198, 97, 25);
		getContentPane().add(pro12Btn);

		pro22Btn = new JButton("Product 2");
		pro22Btn.setBounds(169, 266, 97, 25);
		getContentPane().add(pro22Btn);

		pro32Btn = new JButton("Product 3");
		pro32Btn.setBounds(169, 330, 97, 25);
		getContentPane().add(pro32Btn);

		JLabel lblShop = new JLabel("Shop");
		lblShop.setBounds(12, 90, 56, 16);
		getContentPane().add(lblShop);

		shop1Btn = new JButton("Shop 1");
		shop1Btn.setBounds(22, 119, 97, 25);
		getContentPane().add(shop1Btn);

		shop2Btn = new JButton("Shop 2");
		shop2Btn.setBounds(169, 119, 97, 25);
		getContentPane().add(shop2Btn);
		setVisible(true);
	}
}
