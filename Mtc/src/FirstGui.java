import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class FirstGui extends Mtc implements ActionListener 
	{
		
		JLabel l1;
		JButton b1;
		JButton b2;
		public FirstGui()
		{
			l1 = new JLabel ("Welcome to Mtc World......................");
			b1 = new JButton("Login");
			b2 = new JButton("Ragistration");
			add(l1);
			add(b1);
			add(b2);
			b1.addActionListener(this);
			setLayout(new FlowLayout());
			setVisible(true);
			setSize(350,350);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public void actionPerformed(ActionEvent ae) {
			setVisible(false);
		LoginGui login = new LoginGui();
		
		}
		
	}