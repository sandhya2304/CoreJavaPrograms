package Tuesday2;

import java.util.Scanner;

public class SwapNoWithSubString {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter first string :");
		String a = sc.next();
		
		
		System.out.println("Enter second string :");
		String b = sc.next();
		
		System.out.println(a+" before swapping "+b);
		
		//swapping starts
		a = a+b;
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println(a+" after swapping "+b);
		
		

	}

}
