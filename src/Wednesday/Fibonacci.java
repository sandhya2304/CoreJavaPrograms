package Wednesday;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		int a=0,b=0,c=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the original:");
		int numb = sc.nextInt();
		
		System.out.println("Fibonacci series is:");
		for(int i =0 ; i< numb;i++)
		{
			a = b;
			b= c ;
			c = a+b;
			System.out.print(a+" ");
		}
	}

}
