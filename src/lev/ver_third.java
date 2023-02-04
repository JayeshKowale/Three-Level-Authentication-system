package lev;

import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import com.mysql.jdbc.Statement;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class ver_third  {

	public static  String name1 = new String();
	public static   String fol1 = new String();
	public static   String age1 = new String();
	public static   String mob1 = new String();
	public static   String user_n2= new String();
	public static   String pass2 = new String();
	public static   String em1 = new String();
	public static   String addr1 = new String();
	public static   String pth;
   String rbg3 = new String(); 
	JFrame frame;
     String st="0";
    
     

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ver_third window = new ver_third();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/*public void data1(String nam,String fol,String ag,String mo)
	{
		name1=nam;
		fol1=fol;
		age1=ag;
		mob1=mo;
		System.out.print("data1 performed"+name1+"fol: "+fol1);
		
		
	}
	
	
	public void data2(String user)
	{
		user_n2=user;
		
		System.out.print("data2 performed"+user_n2);
		
	}
	
	public void passd2(String pass)
	{
		pass2=pass;
	}*/
	
	
	public void data3(String r)
	{
		rbg3=r;
	}


	/**
	 * Create the application.
	 */
	Connection con=null;
	
	
	
	public ver_third() {
		con = DB.dbconnect();
		
	/*	initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
//	public void initialize() {  
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1237, 911);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please enter the information for 3rd level");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(406, 61, 480, 63);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				st="1";
			}
		});
		btnNewButton.setIcon(new ImageIcon(ver_third.class.getResource("/img/lv3/depositphotos_29460297-stock-photo-bird-cage.jpg")));
		btnNewButton.setBounds(115, 245, 152, 139);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				st="2";
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(ver_third.class.getResource("/img/lv3/24359364107_152b0152ff_k.jpg")));
		btnNewButton_1.setBounds(335, 245, 175, 139);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				st="3";
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(ver_third.class.getResource("/img/lv3/dbe72qg-7b580b14-87d9-49fa-854c-9607a75fd460.png")));
		btnNewButton_2.setBounds(567, 245, 167, 139);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			st="4";
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(ver_third.class.getResource("/img/lv3/Landscape-Color.jpg")));
		btnNewButton_3.setBounds(792, 245, 146, 139);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				st="6";
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(ver_third.class.getResource("/img/lv3/maxresdefault.jpg")));
		btnNewButton_4.setBounds(194, 499, 196, 152);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				st="5";
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(ver_third.class.getResource("/img/lv3/nebula-galaxies-space-elements-this-260nw-557126443.jpg")));
		btnNewButton_5.setBounds(1008, 245, 180, 139);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				st="7";
			}
		});
		btnNewButton_6.setIcon(new ImageIcon(ver_third.class.getResource("/img/lv3/photo-1462332420958-a05d1e002413.jpeg")));
		btnNewButton_6.setBounds(456, 499, 175, 152);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				st="9";
			}
		});
		btnNewButton_7.setIcon(new ImageIcon(ver_third.class.getResource("/img/lv3/spacee.jpg")));
		btnNewButton_7.setBounds(939, 489, 180, 172);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				st="8";
			}
		});
		btnNewButton_8.setIcon(new ImageIcon(ver_third.class.getResource("/img/lv3/tree-736885__480.jpg")));
		btnNewButton_8.setBounds(693, 499, 188, 152);
		frame.getContentPane().add(btnNewButton_8);
		
		JLabel lblNewLabel_1 = new JLabel("Please select an image !!!!!!");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(495, 159, 196, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		String na=name1;
		
		
		
		
		
		JButton btnNewButton_9 = new JButton("SUBMIT");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					ver_fol v =new ver_fol();
					fol1=v.folder();
					PreparedStatement pst=(PreparedStatement) con.prepareStatement("select * from creden where img=?");
					pst.setString(1, st);
					
					String que="select * from creden";
					Statement st=(Statement) con.createStatement();
				
					ResultSet r=st.executeQuery(que);
					while(r.next())
					{
						 pth= r.getString("path");
					}
					
				
					ResultSet rs =pst.executeQuery();
					
					if(rs.next())
					{
						
						frame.setVisible(false);
						
						Desktop.getDesktop().open(new File(pth));
						main m = new main();
						m.frame.setVisible(true);
						frame.setVisible(false);
						
						
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Please Reverify your credentials!!!!!!");
					}
					
					
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
				
				
			}
		});
		btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_9.setBounds(622, 788, 89, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(ver_third.class.getResource("/img/5cf2660af5f4214def7166dc7a7c8062.jpg")));
		lblNewLabel_2.setBounds(0, 0, 1221, 872);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
