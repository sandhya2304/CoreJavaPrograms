package saturday17;

import java.util.Scanner;

public class PalindromeStringBuffer
{
	public static void main(String[] args) 
	{
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = sc.nextLine().replaceAll("\\s+","");
		
		String reverseString = new StringBuffer(input).reverse().toString();
		
		if(input.equalsIgnoreCase(reverseString))
		{
			System.out.println("palindorme..");
		}else
		{
			System.out.println("not palindrome..");
		}

	}

}
