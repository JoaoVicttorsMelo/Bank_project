package entities;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Bank extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JButton jbtDeposit;
	private JButton jbtwithdraw;
	private JPanel contentPane;

	public Bank() {
		jbtDeposit = new JButton("Deposit");
		jbtwithdraw= new JButton("Withdraw");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.cyan);

		setTitle("bank");
		setSize(550, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		jbtDeposit.addActionListener(this);
		jbtDeposit.setBounds(300, 100, 200, 100);
		jbtwithdraw.addActionListener(this);
		jbtwithdraw.setBounds(30, 100, 200, 100);
		contentPane.add(jbtDeposit);
		contentPane.add(jbtwithdraw);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbtDeposit){
			JOptionPane.showMessageDialog(null,"ola");
		}		
	}
}
