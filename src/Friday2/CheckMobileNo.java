package Friday2;

import java.util.Scanner;

public class CheckMobileNo {

	public static void main(String[] args)
	{
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter the number :");
        String number= sc.next();
        
        if(Utility.numberOrNot(number) && (number.length() == 10))
        {
        	System.out.println("good you have enetere valid number");
        }else
        {
        	System.out.println("number not valid");
        }
		
		
	}
	
	
	

}
