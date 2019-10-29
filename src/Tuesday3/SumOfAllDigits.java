package Tuesday3;

public class SumOfAllDigits
{
	
	
	// They are Modulus Operator (%) and Division operator (/). 
	public static void sumofDigits(int inputNumber)
	{
		 //Creating a copy of input number
		int copyNumber = inputNumber;
		
		//Initializing sum to 0
		int sum = 0;
		
		while(copyNumber!=0)
		{
			
		// if we use modulus operator on any number like number%10, then it will give last digit of the number	
			//Getting last digit of the input number
			int lastDigit = copyNumber % 10;
			
			//Adding last digit to sum			 
			sum = sum + lastDigit;			
			
			// And if we divide any number by 10 i.e number/10, it will remove last digit from the number
			//Removing last digit from the input number
			copyNumber  = copyNumber /10;
			
		}
		System.out.println("Sum Of All Digits In "+inputNumber+" = "+sum);
	}
	

	public static void main(String[] args)
	{
		sumofDigits(23041988);
	}

}
