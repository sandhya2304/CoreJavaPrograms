package Wednesday;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) 
	{
		
		int temp;
		
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:1");
		int numb = sc.nextInt();
		
		for(int i=2;i<=numb/2;i++)
		{
			temp = numb%i;
			if(temp ==0)
			{
				isPrime = false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println("is PRime" +numb);
		}else {
			System.out.println("not prime:"+numb);
		}
		
		

	}

}
