package thursday9;

import java.util.Scanner;

public class StringPalindorme 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String original = sc.next();
		
		String reverse = "";
		
		for(int i = original.length()-1; i>=0;i--)
		{
			reverse = reverse+original.charAt(i);
		}
		
		if(original.equalsIgnoreCase(reverse))
		{
			System.out.println("palindrome "+original);
		}else
		{
			System.out.println("NOT A PALINDROME :"+original);
		}

	}

}
