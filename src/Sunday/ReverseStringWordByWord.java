package Sunday;

import java.util.Scanner;

public class ReverseStringWordByWord {

	public static void main(String[] args)
	{
	
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string:");
	        String inputString = sc.nextLine();
		
	        String ouString = reverString(inputString);
	        
	        System.out.println(inputString);

	        System.out.println(ouString);
	}
	
	public static String reverString(String inputString)
	{
		String[] words = inputString.split("\\s");
		String outputString = "";
		
		for(int i =words.length-1; i >=0;i--)
		{
			outputString = outputString+words[i] +" ";
		}
		return outputString;
		
	}

}
