package entities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entities.profile.Account_profile;

public class Withdraw extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	Account_profile ap = new Account_profile(8000.00);
	Bank bank = new Bank();
	private JTextField balance;
	private JTextField withdraw;
	private JButton confirm;
	private JLabel text_balance;
	private JLabel text_deposit;
	private JButton edit;
	private JButton Update;

	public Withdraw() {
		balance = new javax.swing.JTextField();
		withdraw = new javax.swing.JTextField();
		confirm = new javax.swing.JButton();
		confirm.addActionListener(this);
		text_balance = new javax.swing.JLabel();
		text_deposit = new javax.swing.JLabel();
		edit = new javax.swing.JButton();
		edit.addActionListener(this);
		Update = new javax.swing.JButton();
		Update.addActionListener(this);
		setTitle("Withdraw");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		balance.setEnabled(false);
		balance.setText(String.valueOf(String.format("%.2f", ap.getCash())));
		withdraw.setEnabled(false);

		confirm.setText("Confirm");

		text_balance.setFont(new java.awt.Font("Arial", 1, 14));
		text_balance.setText("Your balance:");
		text_deposit.setFont(new java.awt.Font("Arial", 1, 14));
		text_deposit.setText("how much money you will withdraw?");
		edit.setText("Edit");

		Update.setText("Update");
		Update.setEnabled(false);
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addGroup(
								layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
												.addComponent(text_deposit)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
										.addGroup(layout.createSequentialGroup().addContainerGap()
												.addComponent(text_balance, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGap(130, 130, 130)))
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 281,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 286,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(49, 49, 49))
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 178,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(30, 30, 30)
						.addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 178,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(30, 30, 30)
						.addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(39, 39, 39)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(text_balance, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(77, 77, 77)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(text_deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(31, 31, 31)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		setUndecorated(true);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == confirm) {
			bank.setVisible(true);
			this.setVisible(false);

		}
		if (e.getSource() == edit) {
			Update.setEnabled(true);
			edit.setEnabled(false);
			withdraw.setEnabled(true);
			confirm.setEnabled(false);

		}
		if (e.getSource() == Update) {
			confirm.setEnabled(true);
			edit.setEnabled(true);
			withdraw.setEnabled(false);
			Update.setEnabled(false);
			Double value = Double.parseDouble(withdraw.getText());
			if (value > ap.getCash()) {
				JOptionPane.showMessageDialog(null, "Not enough cash");
			} else {
				balance.setText(String.valueOf(ap.withdraw((value))));

			}
			withdraw.setText("");

		}

	}

}
