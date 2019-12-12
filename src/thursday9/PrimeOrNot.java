package thursday9;

import java.util.Scanner;

public class PrimeOrNot 
{
	public static void main(String[] args)
	{
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number to find prime or not");
		int number = sc.nextInt();
		
		boolean prime = true;
		
		for(int i = 2;i<number;i++)
		{
			if(i%2 == 0)
			{
				prime = false;;
			}
		}
		
		if(prime == true)
		{
			System.out.println("number is prime:"+number);
		}else
		{
			System.out.println("number is not prime"+number);
		}
	}

}
