

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class SwingDemo {

	public static void main(String[] args) 
	{
	MtcWelcome wframe = new MtcWelcome();	
	
	}

}
///////////////
 class MtcWelcome extends JFrame
    {
	 public MtcWelcome()
	 {		
		 	
		 	JLabel l = new JLabel("welcome to MTC world...");
	 		
	 		JLabel l1 = new JLabel("login");
	 		add(l );
	 		add(l1);
	 		setLayout(new FlowLayout() );
		 	setVisible(true);
		 	setSize(400,400);
		 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
	}
