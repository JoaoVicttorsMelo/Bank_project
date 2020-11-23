package entities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import entities.profile.Account_profile;

public class info_Account extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Account_profile ap = new Account_profile("João Victto S. Melo", 8000.0, "000.000.000-00");
	private JTextField field_SSN;
	private JTextField field_Name;
	private JTextField field_Cash;
	private JButton confirm;
	private JButton finish_Edit;
	private JButton edit;
	private JLabel text_Name;
	private JLabel text_SSN;
	private JLabel text_Cash;

	public info_Account() {

		text_Name = new javax.swing.JLabel();
		text_SSN = new javax.swing.JLabel();
		text_Cash = new javax.swing.JLabel();
		field_Name = new javax.swing.JTextField();
		field_SSN = new javax.swing.JTextField();
		field_Cash = new javax.swing.JTextField();
		edit = new javax.swing.JButton();
		edit.addActionListener(this);
		confirm = new javax.swing.JButton();
		confirm.addActionListener(this);
		finish_Edit = new javax.swing.JButton();
		finish_Edit.addActionListener(this);
		setTitle("Info profile");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		text_Name.setFont(new java.awt.Font("Arial", 1, 12));
		text_Name.setText("Name:");

		text_SSN.setFont(new java.awt.Font("Arial", 1, 12));
		text_SSN.setText("SSN:");

		text_Cash.setFont(new java.awt.Font("Arial", 1, 12));
		text_Cash.setText("Cash:");

		field_Name.setEnabled(false);
		field_Name.setText(ap.getName());

		field_SSN.setEnabled(false);
		field_SSN.setText(ap.getSSN());

		field_Cash.setEnabled(false);
		field_Cash.setText(String.valueOf(ap.getCash()));

		edit.setText("Edit");

		confirm.setText("Confirm");

		finish_Edit.setText("Finish Edit");
		finish_Edit.setEnabled(false);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addGap(28, 28, 28).addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addComponent(text_Name)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(
										field_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 287,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addComponent(text_SSN).addGap(18, 18, 18).addComponent(
								field_SSN, javax.swing.GroupLayout.PREFERRED_SIZE, 287,
								javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										false)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										layout.createSequentialGroup()
												.addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(39, 39, 39)
												.addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(finish_Edit, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										layout.createSequentialGroup().addComponent(text_Cash)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(field_Cash, javax.swing.GroupLayout.PREFERRED_SIZE, 287,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(61, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(49, 49, 49)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(text_Name)
						.addComponent(field_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(34, 34, 34)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addComponent(field_SSN, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(text_SSN))
				.addGap(45, 45, 45)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(text_Cash)
						.addComponent(field_Cash, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(finish_Edit, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGap(28, 28, 28)));
		setUndecorated(true);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == edit) {
			field_Name.setEnabled(true);
			confirm.setEnabled(false);
			edit.setEnabled(false);
			finish_Edit.setEnabled(true);
		}

		if (e.getSource() == finish_Edit) {
			confirm.setEnabled(true);
			edit.setEnabled(true);
			field_Name.setEnabled(false);
			finish_Edit.setEnabled(false);
			ap.setName(field_Name.getName());
		}
		if (e.getSource() == confirm) {
			Bank bank = new Bank();
			this.setVisible(false);
			bank.setVisible(true);

		}
	}

}
