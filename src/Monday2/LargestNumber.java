package Monday2;

import java.util.Scanner;

public class LargestNumber
{

	public static void main(String[] args)
	{
		// System.out.println(getLLeassThanL(123, 2));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = scan.nextInt();
		
		System.out.println("Enter the Target number to be not not present: ");
		int targetNum = scan.nextInt();
		
		int temp = 0;
		int temp2 =0;
	
		do
		{
		  int count = 0;
		  number--;
		  temp2 = number;
		
		do
		{
		  temp = temp2 % 10;

		  temp2 = (temp2-temp)/10;

		if(temp==targetNum)
		{
		  count--;
		}
		}
		while(temp2!=0);
		if(count==0)
		{
		   System.out.println(number);
		break;
		}
		}
		while(number!=0);
		}
	

	public static int getLLeassThanL(int digit,int number)
	{
		//Converting digit to char
		 
        char c = Integer.toString(digit).charAt(0);
 
        //Decrementing number & checking whether it contains digit
 
        for (int i = number; i > 0; --i)
        {
            if(Integer.toString(i).indexOf(c) == -1)
            {
                //If 'i' doesn't contain 'c'
 
                return i;
            }
        }
 
        return -1;
		
	}
	
	
}
