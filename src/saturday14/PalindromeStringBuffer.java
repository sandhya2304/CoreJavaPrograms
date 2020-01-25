package saturday14;

import java.util.Scanner;

public class PalindromeStringBuffer
{
	public static void main(String[] args)
	{
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the input string:");
		String word = sc.nextLine().replaceAll("\\s","");

		String reverseString = new StringBuffer(word).reverse().toString();
		
		if(word.equalsIgnoreCase(reverseString))
		{
			System.out.println(word+"is palindrome");
		}else
		{
			System.out.println(word+"is not palindrome");
		}
		
	}

}
