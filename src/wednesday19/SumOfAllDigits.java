package wednesday19;

import java.util.Scanner;

public class SumOfAllDigits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num,rem=0,sum=0,temp;
		
		System.out.println("Enter th number :");
		num = sc.nextInt();
		
		temp = num;
		
		while(num>0)
		{
			rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
		System.out.println("numbe ="+temp+" is "+sum);

	}

}
