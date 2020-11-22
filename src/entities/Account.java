package entities;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

public class Account extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private String Password = "1234";
	private JPasswordField psw;
	private JButton jbConfirm;
	private JButton Del;
	private JButton zero;
	private JButton one;
	private JButton two;
	private JButton thre;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;

	public Account() {
		zero = new JButton("0");
		zero.addActionListener(this);
		one = new JButton("1");
		one.addActionListener(this);
		two = new JButton("2");
		two.addActionListener(this);
		thre = new JButton("3");
		thre.addActionListener(this);
		four = new JButton("4");
		four.addActionListener(this);
		five = new JButton("5");
		five.addActionListener(this);
		six = new JButton("6");
		six.addActionListener(this);
		seven = new JButton("7");
		seven.addActionListener(this);
		eight = new JButton("8");
		eight.addActionListener(this);
		nine = new JButton("9");
		nine.addActionListener(this);

		Del = new JButton("Delet");
		Del.addActionListener(this);
		jbConfirm = new JButton("Confirm");
		jbConfirm.addActionListener(this);
		psw = new JPasswordField();

		setSize(700, 550);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Login");

		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		panel.setBackground(Color.cyan);

		jbConfirm.setBounds(500, 350, 90, 90);
		Del.setBounds(400, 350, 90, 90);
		psw.setBounds(100, 50, 490, 40);

		panel.add(psw);
		panel.add(Del);
		panel.add(jbConfirm);

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
			psw.setText("0");

		}
		if (e.getSource() == one) {
			psw.setText("1");

		}
		if (e.getSource() == two) {
			psw.setText("2");

		}
		if (e.getSource() == thre) {
			psw.setText("3");

		}
		if (e.getSource() == four) {
			psw.setText("4");

		}
		if (e.getSource() == five) {
			psw.setText("5");

		}
		if (e.getSource() == six) {
			psw.setText("6");

		}
		if (e.getSource() == seven) {
			psw.setText("7");

		}
		if (e.getSource() == eight) {
			psw.setText("8");

		}
		if (e.getSource() == nine) {
			psw.setText("9");

		}

	}

}
