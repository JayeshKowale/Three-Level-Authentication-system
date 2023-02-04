package lev;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class test extends fol {

    JFrame frame;
    private JTextField textField;
 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void my(String str)
	{
		String str1=str;
		nm=str1;
		
	}

	/**
	 * Create the application.
	 */
	Connection con=null;
	   fol fo =new fol();
	    String nm;
		
	public test() {
	    con = DB.dbconnect();
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(184, 78, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				fol fo=new fol();
				first f = new first();
				second s=new second();
				//nm="uu";
				//String nm=fo.name;
				
				//third t=new third();
				/*String name=fo.name;
				String fol=fo.fol_name;
				String age=fo.age;
				String mob=fo.mob;
				String user_n=f.user_n;
				String pass=f.pass;
				String rbg=s.rbg;
				String ss=st;*/
				
				System.out.print("name is"+nm);
			
			String t=textField.getText();
			PreparedStatement pst;
			try {
				pst = con.prepareStatement("insert into test(tes)values(?)");
				 pst.setString(1, t);                  // index and variable nam
					pst.execute();
					JOptionPane.showMessageDialog(null,"DATA ADDED");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}    //TAble values
		   
			
			
			}
		});
		btnNewButton.setBounds(157, 184, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
