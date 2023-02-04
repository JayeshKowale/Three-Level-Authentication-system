package lev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class ver_first {

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
					ver_first window = new ver_first();
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
	public ver_first() {
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
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(162, 50, 506, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setBounds(176, 184, 101, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		usern = new JTextField();
		usern.setBounds(382, 183, 188, 20);
		frame.getContentPane().add(usern);
		usern.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_2.setBounds(176, 297, 95, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		passw = new JPasswordField();
		passw.setBounds(382, 296, 188, 20);
		frame.getContentPane().add(passw);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				user_n=usern.getText();
				pass=passw.getText();
				
				try {
					PreparedStatement pst=(PreparedStatement) con.prepareStatement("select * from creden where user=? and pass=?");
					pst.setString(1, user_n);
					pst.setString(2, pass);
					ResultSet rs =pst.executeQuery();
					
					if(rs.next())
					{
						ver_second vr = new ver_second();
						vr.frame.setVisible(true);
						frame.setVisible(false);
						
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Please Reverify your credentials!!!!!!");
					}
					
					
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(307, 437, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("LOG-IN");
		lblNewLabel_3.setForeground(SystemColor.text);
		lblNewLabel_3.setBackground(SystemColor.text);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3.setBounds(312, 107, 119, 37);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(ver_first.class.getResource("/img/EQOwW0.jpg")));
		lblNewLabel_4.setBounds(0, 0, 825, 586);
		frame.getContentPane().add(lblNewLabel_4);
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
