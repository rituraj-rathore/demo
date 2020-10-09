import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
 
public class Count_Frequency2
{   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         
        //taking input
         
        System.out.println("Enter the number :");
         
        int inputNumber = sc.nextInt();
         
                 
        HashMap<Integer, Integer> digitCountMap = new HashMap<Integer, Integer>();
         
        while (inputNumber != 0)
        {
           
             
            int lastDigit = inputNumber % 100;
             
            if(digitCountMap.containsKey(lastDigit))
            {
               
                 
                digitCountMap.put(lastDigit, digitCountMap.get(lastDigit)+1);
            }
            else
            {
                
                digitCountMap.put(lastDigit, 1);
            }
             
            //Removing lastdigit
             
            inputNumber = inputNumber / 100;
        }
         
        //Printing digits frequency
         
        System.out.println(" ");
         
        System.out.println("Digits : Frequency");
         
        System.out.println("=");
         
        Set<Integer> keys = digitCountMap.keySet();
         
        for (Integer key : keys) 
        {
            System.out.println("   "+key+"   :   "+digitCountMap.get(key));
        }
         
        sc.close();
    }
}
