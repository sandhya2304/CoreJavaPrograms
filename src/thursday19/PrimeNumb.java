package thursday19;

import java.util.Scanner;

public class PrimeNumb
{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter th enumber");
		int numb = sc.nextInt();
		
		boolean prime = true;
		
		for(int i=2;i<numb;i++)
		{
			if(i%2==0)
			{
				prime = false;
			}
			
		}
		if(prime == true)
		{
		System.out.println("number is prime");
		}else
		{
			System.out.println("number is not prime");
		}
		
	}

}
