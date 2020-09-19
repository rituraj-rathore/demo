package mahabali;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home_Page extends Mahabali implements ActionListener
{
	JLabel l1;
	JButton b1;
	JButton b2;
	
	
	
	public Home_Page() 
	{
	    l1= new JLabel("Welcome to home page");
	    b1 = new JButton("go to login page");
	    b2 = new JButton("go to ragister page");
	    add(l1);
	    add(b1);
	    add(b2);
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	    
	    
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(250,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			gologin = new Login_Page();
			setVisible(false);
		} 
		if(ae.getSource()==b2)
		{
			Ragistration_user rakesh = new Ragistration_user();
			setVisible(false);
		}
	}

}
