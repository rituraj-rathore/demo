import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Mtc extends JFrame
{	static int i = 0;
	static String [] first_name = new String[100];
	static String [] last_name = new String[100];
	static String [] full_address = new String[100];
	static int [] mobile_number = new int[100];
	static String [] user_id = new String[100];
	static String [] pass_word = new String[100];
	

	public static void main(String[] args)
	{
		
		FirstGui home = new FirstGui();
		getresponse();
		
	}

	public static void getresponse()
	{
		System.out.println("press '1' for user login");
		System.out.print("press '2' for user ragistration ");

		Scanner userinput = new Scanner(System.in);
		int response = userinput.nextInt();
		if(response==1)
		{
			System.out.println("Welcome to login page ");
			Login wantlogin = new Login();
			wantlogin.userlogin();
		}
		else if(response==2)
		{
			System.out.println("welcome to ragistration page ");
			Ragistration wantragister = new Ragistration();
			wantragister.user_ragister();
		}
		else 
		{
			System.out.print("please give valid input ");
			getresponse();
		}
	}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}