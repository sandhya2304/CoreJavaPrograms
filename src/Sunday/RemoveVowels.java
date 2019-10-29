package Sunday;

import java.util.Scanner;

public class RemoveVowels
{

	public static void main(String[] args)
	{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String word = sc.nextLine();
        
        String newWord = word.replaceAll("[AEIOUaeiou]","");
        System.out.println("String without vowels");

        System.out.println(newWord);
        
	}

}
