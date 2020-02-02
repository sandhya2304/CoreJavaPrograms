package sunday17;

import java.util.Scanner;

public class WordToWordReverse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the words ");
		String word = sc.nextLine();
		String outp = reverseSentence(word);
		System.out.println(word);
		System.out.println(outp);
        sc.close();
	}
	
	public static String reverseSentence(String input)
	{
		String[] words = input.split("\\s");
		String output = "";
		
		for(int i = words.length-1;i >=0;i--)
		{
			output = output + words[i]+" ";
		}
		return output;
	}
}
