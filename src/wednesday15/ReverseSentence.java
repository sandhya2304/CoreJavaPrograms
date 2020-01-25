package wednesday15;

import java.util.Scanner;

public class ReverseSentence
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String inp = sc.nextLine();
         String output = reverseS(inp);
         System.out.println("input--->"+inp);
		System.out.println("output-->"+output);
		sc.close();
	}

	public static String reverseS(String word)
	{
		String[] words = word.split("\\s");
		String outputString = "";
		
		for(int i =words.length-1;i >= 0;i--)
		{
			outputString = outputString+words[i]+"";
		}
		
		return outputString;
	}
	
}
