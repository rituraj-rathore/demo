package mahabali;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


class Ragistration_user extends Mahabali implements ActionListener

{   String userid ;
	String pass ;
	String name;
	String gender;
	String address;
	int mobile = 0;
	//String q = "insert into user_ragister values ('aaa','aaa','aaa','mail','aaa' ,121212)";
	
	
	String q;																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;
	JRadioButton c1;
	JRadioButton c2;
	JTextField t5;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JButton b1;
	JButton b2;
			
	
	public Ragistration_user() 
	{
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		t3 = new JTextField(15);
		t4 = new JTextField(15);
		t5 = new JTextField(20);
        l1 =new JLabel(" name");
		l2 =new JLabel("userid");
		l3 =new JLabel("pass");
		l4 = new JLabel(" add.");
		l5 = new JLabel(" m_no.");
		b1 = new JButton ("submit");
		b2 = new JButton ("GO TO LOGIN PAGE CLICK HERE          ");
		c1= new JRadioButton("male");
		c2 =  new JRadioButton("female");
		add(b2);
		add(l1); add(t1);
		add(l2); add(t2);
		add(l3); add(t3);
		add(l4); add(t4);
		add(l5); add(t5);
		add(c1); add(c2);
		add(b1);
		
		
			
		
	
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(250,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	 
	
	public void actionPerformed(ActionEvent ae) 
	{	
		if (ae.getSource()==b2)
		{
			gologin = new Login_Page();
			setVisible(false);
		}
		
		
		
		
		if (ae.getSource()==b1) 
		{
			Boolean b= true;
			Boolean c= true;
			if(t5.getText().equals(""))   
			{
				
			}else mobile =Integer.parseInt(t5.getText());	 
			System.out.print(t5.getText());
			userid =t2.getText();
			System.out.print(name+" ");
			pass = t3.getText();
			name = t1.getText();
			ButtonGroup bg = new ButtonGroup();
			bg.add(c1);
			bg.add(c2);
			if(c1.isSelected()) gender = "male";
			if (c2.isSelected()) gender ="female";
			address = t4.getText();
			if (t2.getText().equals("")) 
			{
				b= false;
				System.out.println("user id can't be null   ");
			}
			
			if (t5.getText().equals("")) 
			{
				c= false;
				System.out.println("mobile number can't be null   ");
			}
			
			
			if(b&&c) {
						q= "INSERT INTO user_ragister VALUES ('"+userid+"' ,'" +pass+ "','"+ name+"','"+gender+"','"+address+"',"+ mobile +")"	;
		
						try {
							updating_data(q);
						} catch (Exception e) 
						{
					System.out.println("exception ocurred"+e);
						}
				}	
			         
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			t4.setText(null);
			t5.setText(null);
			
		}
		
	}
	     
	
}
