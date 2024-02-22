package cse;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class signin {

	private JFrame frame;
	private JTextField t1;
	private JTextField p1;
	private JTextField t2;
	private JTextField p2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signin window = new signin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public signin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 610, 327);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign in page");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(176, 11, 202, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel user = new JLabel("User name :");
		user.setFont(new Font("Verdana", Font.ITALIC, 15));
		user.setBounds(10, 93, 96, 23);
		frame.getContentPane().add(user);
		
		JLabel lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setFont(new Font("Verdana", Font.ITALIC, 15));
		lblNewLabel_2.setBounds(10, 150, 86, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBounds(116, 98, 115, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		p1 = new JTextField();
		p1.setBounds(116, 155, 115, 20);
		frame.getContentPane().add(p1);
		p1.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				     
				
			
				
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(65, 229, 86, 20);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("User name :");
		lblNewLabel_3.setFont(new Font("Verdana", Font.ITALIC, 15));
		lblNewLabel_3.setBounds(283, 99, 108, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password :");
		lblNewLabel_4.setFont(new Font("Verdana", Font.ITALIC, 15));
		lblNewLabel_4.setBounds(283, 156, 95, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		t2 = new JTextField();
		t2.setBounds(400, 96, 143, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		p2 = new JTextField();
		p2.setBounds(400, 153, 143, 20);
		frame.getContentPane().add(p2);
		p2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Sign up :");
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1.setBounds(361, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
