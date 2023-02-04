package lev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.SystemColor;

public class second {

	JFrame frame;
	String rbg=new String();
	String ss=new String();
    public JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					second window = new second();
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
	Connection con=null;
	public second() {
		con = DB.dbconnect();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 694, 556);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please enter the information for second level ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(119, 39, 459, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String r="4234fds";
			rbg=rbg+r;
			
			passwordField.setText(rbg);
			
			}
		});
		btnNewButton.setIcon(new ImageIcon(second.class.getResource("/img/Flag_Vice_Admiral_of_Red_1805_to_186411.png")));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(158, 193, 89, 69);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Red");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(194, 273, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String b="ffhb732";
				rbg=rbg+b;
				
				passwordField.setText(rbg);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(second.class.getResource("/img/Blue---the-colour-008.jpg")));
		btnNewButton_1.setBounds(301, 193, 89, 69);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Blue");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(330, 273, 60, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g="kjjaac";
				rbg=rbg+g;
				
				passwordField.setText(rbg);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(second.class.getResource("/img/1200px-Solid_green.svg.png")));
		btnNewButton_2.setBounds(453, 193, 89, 69);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("Green");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(476, 274, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Please select the RBG colurs randomly and remember it for your future purpose");
		lblNewLabel_4.setForeground(SystemColor.text);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(87, 134, 552, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_3 = new JButton("NEXT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				third t = new third();
				t.data3(rbg);
				t.frame.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(301, 454, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		passwordField = new JPasswordField();
		passwordField.setEditable(false);
		passwordField.setBounds(236, 398, 214, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(second.class.getResource("/img/38-388110_background-wallpaper-colorful-website-background-design.jpg")));
		lblNewLabel_5.setBounds(0, 0, 678, 517);
		frame.getContentPane().add(lblNewLabel_5);
	}

}
