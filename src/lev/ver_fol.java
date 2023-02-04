package lev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class ver_fol  {

	public JFrame frame;
	 public static String name=new String();
	 public static String fol_name=new String();
	 public static String age=new String();
	 public static String mob=new String();
	 public static String email;
	 public static String addr;
	 public static String pathf;
	 JTextField textField= new JTextField();
	//public JTextField textField;
	public JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ver_fol window = new ver_fol();
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
	public ver_fol() {
		con = DB.dbconnect();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1031, 751);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please enter the related information");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel.setBounds(270, 42, 336, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Your name  :-");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(235, 253, 122, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Folder Name  :-");
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(235, 382, 133, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(445, 266, 197, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(445, 382, 197, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				name=textField.getText();
				fol_name=textField_1.getText();
				
				
				try {
					PreparedStatement pst=(PreparedStatement) con.prepareStatement("select * from creden where name=? and folder_name=?");
					pst.setString(1, name);
					pst.setString(2, fol_name);
					ResultSet rs=pst.executeQuery();
					if(rs.next())
					{
						ver_first v =new ver_first();
						v.frame.setVisible(true);
						frame.setVisible(false);
					}
					
					else
					{
						JOptionPane.showMessageDialog(btnNewButton, "Please Reverify your credentials!!!!!! ");
					}
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			   
				
				/*try {
					PreparedStatement pst=con.prepareStatement("insert into fol(name,folder_name,age,mobile,e_mail,address)values(?,?,?,?,?,?)");
					pst.setString(1, name);
					pst.setString(2, fol_name);
					pst.setString(3, age);
					pst.setString(4, mob);
					pst.setString(5, email);
					pst.setString(6, addr);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Successfully added........");
					
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
				
				
				
				
				
				//third t = new third(name,fol_name,age,mob);
				// t.data1(name,fol_name,age,mob);
			
				
				//test t=new test();
				//t.frame.setVisible(true); test
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(388, 556, 111, 37);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("Log-in");
		lblNewLabel_7.setForeground(SystemColor.text);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_7.setBounds(370, 128, 79, 32);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(137, 269, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(ver_fol.class.getResource("/img/5cf2660af5f4214def7166dc7a7c8062.jpg")));
		lblNewLabel_4.setBounds(0, 0, 1015, 712);
		frame.getContentPane().add(lblNewLabel_4);
	}

public  String folder()
{
	return fol_name;
}

public String name()
{
	return name;
}
public String age()
{
	return age;
}

public String mob()
{
	return mob;
}

public String email()
{
	return email;
	
}
public String addr()
{
	return addr;
}

public String path()
{
	return pathf;
}
}

