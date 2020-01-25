package saturday14;

import java.util.Scanner;

public class ReverseSentenceDemo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String input = sc.nextLine();
		String output = reverseSentence(input);
		System.out.println("input--->"+input);
		System.out.println("output -->"+output);
	}
	
	public static String reverseSentence(String input)
	{
		String[] words = input.split("\\s");
		String outputString = "";
		
		for(int i=words.length-1;i >=0;i--)
		{
			outputString = outputString+words[i]+"";
		}
		return outputString;
	}
}
