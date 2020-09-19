import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class AddGui {

	public static void main(String[] args)
	{
	    Addition add = new Addition();
	}

}
class Addition extends JFrame implements ActionListener
    {
		JTextField t1;
		JTextField t2;
		JLabel l1;
		JButton b;
		public Addition()
		{
				t1 = new JTextField (20);
				t2 = new JTextField (20);
				l1 = new JLabel("Result");
				b = new JButton("ok");
				
				add(t1);
				add(t2);
				add(b);
				add(l1);
				b.addActionListener(this);
			
			setLayout(new FlowLayout());
			setVisible(true);
			setSize(250,300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public void actionPerformed(ActionEvent ae)
		{
			 
			int num1= Integer.parseInt(t1.getText());
			int num2= Integer.parseInt(t2.getText());
			int value = num1+num2;
			l1.setText(value+" ");
		}
	}
