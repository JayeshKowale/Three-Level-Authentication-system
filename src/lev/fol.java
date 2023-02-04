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
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class fol  {

	public static JFrame frame;
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
	public JTextField textField_2;
	public JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fol window = new fol();
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
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField path;
	public fol() {
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
		lblNewLabel.setForeground(SystemColor.menu);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel.setBounds(235, 42, 336, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Your name");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1.setBounds(210, 156, 101, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Folder Name");
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_2.setBounds(210, 213, 69, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(433, 153, 122, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(433, 210, 122, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				name=textField.getText();
				fol_name=textField_1.getText();
				age=textField_2.getText();
				mob=textField_3.getText();
				email=textField_4.getText();
				addr=textField_5.getText();
				pathf=path.getText();
				
				first f = new first();
				
                frame.setVisible(false);
				
				f.frame.setVisible(true);
			   
				
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
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(343, 553, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		JLabel lblNewLabel_3 = new JLabel("Age");
		lblNewLabel_3.setForeground(SystemColor.text);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_3.setBounds(210, 270, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(433, 267, 122, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(433, 329, 122, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile No.");
		lblNewLabel_4.setForeground(SystemColor.text);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(210, 331, 80, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("E-mail");
		lblNewLabel_5.setForeground(SystemColor.text);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(210, 397, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Address");
		lblNewLabel_6.setForeground(SystemColor.text);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6.setBounds(210, 455, 80, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(433, 395, 122, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(433, 453, 122, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Register");
		lblNewLabel_7.setForeground(SystemColor.controlLtHighlight);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_7.setBounds(353, 92, 79, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Give a customize Directory name for your folder  if you want to...");
		lblNewLabel_8.setForeground(SystemColor.text);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_8.setBounds(584, 521, 421, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		path = new JTextField();
		path.setBounds(677, 555, 251, 20);
		frame.getContentPane().add(path);
		path.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(fol.class.getResource("/img/5cf2660af5f4214def7166dc7a7c8062.jpg")));
		lblNewLabel_9.setBounds(0, 0, 1015, 712);
		frame.getContentPane().add(lblNewLabel_9);
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

