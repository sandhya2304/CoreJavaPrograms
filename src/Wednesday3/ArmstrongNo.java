package Wednesday3;

public class ArmstrongNo
{
	public static void main(String[] args)
	{
		
               armstrong(153);
	}
	
	
	public static void armstrong(int number)
	{
		
		int copyNumber = number;
	
		// we use String.valueOf(number).length() which gives the number of digits in a given number.
		int noOfDigits = String.valueOf(number).length();
		
		int sum = 0;
		
		while(copyNumber!=0)
		{
			
			// You may know that, if we use modulus operator like number%10, it will give last digit of the number
			int lastDigit = copyNumber % 10;
			int lastDigitToThePowerofNoOgDigits = 1;
			for(int i=0;i < noOfDigits;i++)
			{
				
		//After getting last digit of the number, we multiply it by itself equal to ‘noOfDigits’ times,
				lastDigitToThePowerofNoOgDigits = lastDigitToThePowerofNoOgDigits * lastDigit;				
			}
			//store it into ‘lastDigitToThePowerOfNoOfDigits’ and add it to ‘sum
			sum = sum + lastDigitToThePowerofNoOgDigits;
			
			// we divide the ‘copyOfNumber‘ by 10 i.e copyOfNumber/10. It will remove the last digit
			//from the number. We continue these steps until ‘copyOfNumber‘ becomes 0.
			copyNumber = copyNumber /10;
		}
		
		if(sum == number)
		{
			System.out.println("armstrong = "+number);
		}else
		{
			System.out.println("not armstrong ="+number);
		}
		
	}

}
