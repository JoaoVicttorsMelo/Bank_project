package entities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Bank extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JButton Account;
	private JButton Deposit;
	private JButton Withdraw;

	public Bank() {

		Deposit = new javax.swing.JButton();
		Deposit.addActionListener(this);
		Withdraw = new javax.swing.JButton();
		Withdraw.addActionListener(this);
		Account = new javax.swing.JButton();
		Account.addActionListener(this);
		setTitle("Bank");
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Deposit.setText("DEPOSIT");

		Withdraw.setText("WITHDRAW");

		Account.setText("ACCOUNT");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(35, 35, 35)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addGroup(layout.createSequentialGroup()
										.addComponent(Deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 117,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(Withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 117,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(Account, javax.swing.GroupLayout.PREFERRED_SIZE, 317,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(39, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(34, 34, 34)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 133,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 133,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addComponent(Account, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
						.addGap(46, 46, 46)));

		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Deposit) {
			Deposit dp= new Deposit();
			dp.setVisible(true);
			this.setVisible(false);

		}
		if(e.getSource()== Withdraw) {
			Withdraw withdraw= new Withdraw();
			withdraw.setVisible(true);
			this.setVisible(false);
		}
		if(e.getSource()== Account) {
			info_Account ia= new info_Account();
			ia.setVisible(true);
			this.setVisible(false);
		}
	}
}
