import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginGui extends Mtc implements ActionListener

{		JTextField t1;
		JTextField t2;
		JLabel l1;
		JLabel l2;
		JButton b1;
		JLabel l3;
		JLabel l4;
	

	public LoginGui()
	
	{	l3 = new JLabel("      *-----WELCOME TO LOGIN PAGE-----*     ");
		l1= new JLabel("User id    ");
		t1= new JTextField(20);
		l2= new JLabel("password");
		t2 = new JTextField(20);
		b1 = new JButton("submit");
		l4 = new JLabel("please type valid user id");
		
		add(l3);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
	     b1.addActionListener(this);
		setVisible(true);
		setSize(350,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
	}
	
	public LoginGui(boolean b)
	
	{
		if(b)
		{
		l3 = new JLabel("      user id is valid         ");
		l1= new JLabel("User id    ");
		t1= new JTextField(20);
		l2= new JLabel("password");
		t2 = new JTextField(20);
		b1 = new JButton("submit");
		l4 = new JLabel("please type valid user id");
		
		add(l3);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
	     b1.addActionListener(this);
		setVisible(true);
		setSize(350,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		}
		else
		
			
			{	l3 = new JLabel("      please type valid userid      ");
				l1= new JLabel("User id    ");
				t1= new JTextField(20);
				l2= new JLabel("password");
				t2 = new JTextField(20);
				b1 = new JButton("submit");
				l4 = new JLabel("please type valid user id");
				
				add(l3);
				add(l1);
				add(t1);
				add(l2);
				add(t2);
				add(b1);
			     b1.addActionListener(this);
				setVisible(true);
				setSize(350,350);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setLayout(new FlowLayout());
			}


		
	}



	
	public void actionPerformed(ActionEvent ae) {
		
		String userid =t1.getText();
		Login user = new Login();
		boolean u = (user.isValidUserId(userid));
		System.out.println(" "+ u);
		LoginGui veryfication = new LoginGui(u);
		setVisible(false);
		
		
	}
	
	
}