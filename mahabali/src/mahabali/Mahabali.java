package mahabali;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Mahabali extends JFrame
{

	public static String query ;
	static Statement st;
	static ResultSet rs;
	static Home_Page gohome;
	static Login_Page gologin;
	
	
	
	public static void main(String[] args) throws Exception
	{	
		
		
		
	//fetching_data(query);
	gohome = new Home_Page();
	
		

	}
	
	static public void fetching_data(String u, String p) throws Exception
	{	String url = "jdbc:mysql://localhost/mahabali";
		String uname = "root";
		String pass = "deepak";
		Class.forName("com.mysql.cj.jdbc.Driver");
		String name;
		String paswrd;
		Boolean b= true;
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		st = con.createStatement();
		
		rs = st.executeQuery("select * from user_ragister");

		
		while(rs.next())
		{
		name = rs.getString(1);
		paswrd = rs.getString(2);
		
		if(name.equals(u))
		{
			if(paswrd.equals(p)) 
				{ 
				System.out.println("succesfully login");
				b=false;
				}
		}
			
		}
		if(b) System.out.println(" please give valid user id and password ");
		st.close();
		rs.close();
		
	}

	
	public void updating_data(String s) throws Exception
	{	String url = "jdbc:mysql://localhost/mahabali";
		String uname = "root";
		String pass = "deepak";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		st = con.createStatement();
		
		
		
		st.executeUpdate(s);
		
		System.out.println("updated"); 
		st.close();
		
	}


}

