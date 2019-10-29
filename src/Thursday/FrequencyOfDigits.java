package Thursday;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class FrequencyOfDigits {

	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Input from the user:");
		int inputNumber = sc.nextInt();
		
		HashMap<Integer, Integer> digitCount = new HashMap<Integer, Integer>();
		while(inputNumber!=0)
		{
			 //Get the lastDigit of inputNumber
			int lastDigit = inputNumber % 10;
			
			if(digitCount.containsKey(lastDigit))
			{
				digitCount.put(lastDigit,digitCount.get(lastDigit)+1);
			}else
			{
				digitCount.put(lastDigit,1);
			}
			
			//removing the last digit from input number
			inputNumber = inputNumber / 10;
			
			//System.out.println(digitCount);
			
		}
		
		//printing digits and their frequencies
		System.out.println("*******************************************");
		System.out.println("***********Digits : Frequencies*****");
		
		
		//Now iterate through the digitCountMap to get the frequency of all digits of inputNumber.
		
		Set<Integer> keys = digitCount.keySet();
		for(Integer key : keys)
		{
			System.out.println(key+" : "+digitCount.get(key));
		}
		
		
		
		

	}

}
