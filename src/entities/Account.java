package entities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Account extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private String Password = "123";
	private JPasswordField psw;
	private JButton jbConfirm;
	private JButton Del;
	private JButton zero;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;

	public Account() {

		        psw = new javax.swing.JPasswordField();
		        zero = new javax.swing.JButton();
		        zero.addActionListener(this);
		        one = new javax.swing.JButton();
		        one.addActionListener(this);
		        two = new javax.swing.JButton();
		        two.addActionListener(this);
		        three = new javax.swing.JButton();
		        three.addActionListener(this);
		        four = new javax.swing.JButton();
		        four.addActionListener(this);
		        five = new javax.swing.JButton();
		        five.addActionListener(this);
		        six = new javax.swing.JButton();
		        six.addActionListener(this);
		        seven = new javax.swing.JButton();
		        seven.addActionListener(this);
		        eight = new javax.swing.JButton();
		        eight.addActionListener(this);
		        nine = new javax.swing.JButton();
		        nine.addActionListener(this);
		        Del = new javax.swing.JButton();
		        Del.addActionListener(this);
		        jbConfirm = new javax.swing.JButton();
		        jbConfirm.addActionListener(this);
		        setLocationRelativeTo(null);

		        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		        zero.setText("0");
		    
		        one.setText("1");

		        two.setText("2");

		        three.setText("3");

		        four.setText("4");

		        five.setText("5");

		        six.setText("6");

		        seven.setText("7");

		        eight.setText("8");

		        nine.setText("9");

		        Del.setText("DEL");

		        jbConfirm.setText("CONFIRM");

		        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		        getContentPane().setLayout(layout);
		        layout.setHorizontalGroup(
		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(layout.createSequentialGroup()
		                .addGap(58, 58, 58)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                    .addComponent(jbConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                    .addComponent(psw)
		                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                            .addComponent(four, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
		                            .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                            .addComponent(eight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                            .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
		                            .addComponent(five, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                            .addComponent(nine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addGroup(layout.createSequentialGroup()
		                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                                    .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
		                                    .addComponent(six, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                    .addComponent(seven, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
		                                    .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
		                            .addComponent(Del, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
		                .addGap(70, 70, 70))
		        );
		        layout.setVerticalGroup(
		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(layout.createSequentialGroup()
		                .addGap(31, 31, 31)
		                .addComponent(psw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(Del, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                .addComponent(jbConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addContainerGap(13, Short.MAX_VALUE))
		        );

		        pack();
		    // </editor-fold>

	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbConfirm) {
			if (psw.getText().equals(Password)) {
				Bank bank = new Bank();
				bank.setVisible(true);
				this.setVisible(false);
			} else {
				JOptionPane.showMessageDialog(null, "Your password is wrong!");
			}
		}
		if (e.getSource() == Del) {
			String text = psw.getText();
			text = text.substring(0, text.length() - 1);
			psw.setText(text);
		}
		if (e.getSource() == zero) {
			psw.setText(psw.getText() + "0");

		}
		if (e.getSource() == one) {
			psw.setText(psw.getText() + "1");

		}
		if (e.getSource() == two) {
			psw.setText(psw.getText() + "2");

		}
		if (e.getSource() == three) {
			psw.setText(psw.getText() + "3");

		}
		if (e.getSource() == four) {
			psw.setText(psw.getText() + "4");

		}
		if (e.getSource() == five) {
			psw.setText(psw.getText() + "5");

		}
		if (e.getSource() == six) {
			psw.setText(psw.getText() + "6");

		}
		if (e.getSource() == seven) {
			psw.setText(psw.getText() + "7");

		}
		if (e.getSource() == eight) {
			psw.setText(psw.getText() + "8");

		}
		if (e.getSource() == nine) {
			psw.setText(psw.getText() + "9");

		}

	}

}
