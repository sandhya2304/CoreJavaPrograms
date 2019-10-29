package Tuesday;

import java.util.Scanner;

public class SwapTemp {

	public static void main(String[] args)
	{
		String temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word a");
		String a = sc.nextLine();
		System.out.println("Enter the word b");
		String b = sc.nextLine();
		
		System.out.println(a+" "+b+"before swap");
		temp = a;
		a = b ;
		b = temp;
		
		System.out.println(a+" "+b+"After swap");

	}

}
