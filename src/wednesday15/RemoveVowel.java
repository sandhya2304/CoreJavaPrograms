package wednesday15;

import java.util.Scanner;

public class RemoveVowel
{
	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String word = sc.next();
		String newString = word.replaceAll("[AEIOUaeiou]", "");
		
		System.out.println("String without vowels "+newString);

	}

}
