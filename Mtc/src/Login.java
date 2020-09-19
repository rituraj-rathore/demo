import java.util.Scanner;


public class Login extends Mtc
 {		public static int q;
	 public static Boolean b;
	 public static Boolean c;
	  public static Boolean isValidUserId (String user)
	    {
	
	    	for(int j=0 ;j<=i;j=j+1)
	    	{
	    		if(user.equals(user_id[j])) 
	    			{
	    			b= true;
	    			q=j;
	    			break;
	    			} else b=false;
	    		
	    	}
	    	
			return b ;
	    }
	  public static Boolean isValidPassWord (String pass)
	    {
	    	
	    		if(pass.equals(pass_word[q])) 
	    		{
	    			c=true;
	    			
	    		}
	    		
	    		else c=false;
	    	
	    	return c;
	    }
	public static void userlogin()
	{ 
		Scanner userresponse = new Scanner(System.in);
		 String username ;
		    int count1 = 0;
		    int count2 = 0;
		 
		do
		{
			if(count1==0)
			{
			System.out.print("type userid ");
			count1++;
			}
			else
				System.out.print("please type valic userid ");
			username = userresponse.next();
	   	}while(!(isValidUserId(username)));
		
		 String userpassword; 
		 
		 
		do
		{

			if(count2==0)
			{
			System.out.print("type password ");
			count2++;
			}
			else
				System.out.print("please type valid password ");
	    userpassword = userresponse.next();
	    } while(!(isValidPassWord(userpassword)));
		System.out.println("you succesfully log in...");
		}

}
