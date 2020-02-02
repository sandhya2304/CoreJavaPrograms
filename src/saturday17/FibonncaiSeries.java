package saturday17;

import java.util.Scanner;

public class FibonncaiSeries
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		
		int first = 0;
		int second = 1;
		int third = 0;
		
		while(third < inputNumber)
		{
			third = first+second;
			first = second;
			second = third;
		}
		if(third == inputNumber)
		{
			System.out.println("fibonnn");
		}else
		{
			System.out.println("not fibo..");
		}
	}

}
