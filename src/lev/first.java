package lev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class first {

    JFrame frame;
public static String user_n=new String();
   public static  String pass=new String();
    public static String  f;
    String nam;
    
	 public JTextField usern;
	 public JPasswordField passw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					first window = new first();
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
	public first() {
		con = DB.dbconnect();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 22));
		frame.setBounds(100, 100, 841, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please enter Information for 1st level of authentication");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(162, 50, 506, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setBounds(169, 162, 101, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		usern = new JTextField();
		usern.setBounds(341, 161, 188, 20);
		frame.getContentPane().add(usern);
		usern.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBackground(Color.BLUE);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_2.setBounds(162, 258, 95, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		passw = new JPasswordField();
		passw.setBounds(341, 277, 188, 20);
		frame.getContentPane().add(passw);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				third t = new third();
				fol ff = new fol();
				f=ff.folder();
				nam=ff.name();
				
				user_n=usern.getText();
				pass=passw.getText();
				
				//System.out.print("folder name"+f+"name is "+nam);
				//t.data2(user_n);
				//t.passd2(pass);
				frame.setVisible(false);
				second s = new second();
				s.frame.setVisible(true);
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(320, 438, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(first.class.getResource("/img/EQOwW0.jpg")));
		lblNewLabel_3.setBounds(0, 0, 825, 586);
		frame.getContentPane().add(lblNewLabel_3);
	}
	
	public String user()
	{
		return user_n;
	}
	public String pass()
	{
		return pass;
	}
}
