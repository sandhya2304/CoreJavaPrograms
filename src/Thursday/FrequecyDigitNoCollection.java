package Thursday;

import java.util.Scanner;

public class FrequecyDigitNoCollection
{

	public static void main(String[] args)
	{
		
        Scanner sc =new Scanner(System.in);
		
		System.out.println("Input from the user:");
		int inputNumber = sc.nextInt();
		
		int[] digitCount = new int[10];
		
        while(inputNumber !=0)
        {
        	 //Get the lastDigit of inputNumber
        	int lastDigit = inputNumber % 10;
        	
        	//incrementing the lastDigit's count
        	digitCount[lastDigit]++;
        	
        	 //Removing the lastDigit from inputNumber
        	inputNumber = inputNumber / 10;
        	
        	
        }
		
		//printing the array
        System.out.println("digits frequencies :");
        
        for(int i = 0 ;i<digitCount.length;i++)
        {
        	if(digitCount[i]!=0)
        	{
        		System.out.println(i+" : "+digitCount[i]);
        	}
        }
        
        
        
		
	}

}
