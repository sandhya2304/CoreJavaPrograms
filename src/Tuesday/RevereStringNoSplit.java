package Tuesday;

import java.util.Scanner;

public class RevereStringNoSplit {

	public static void main(String[] args) 
	{
		
		String original,revers = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		original = sc.nextLine();
		
		int length = original.length();
		
		for(int i = length-1; i >=0;i--)
		{
			revers = revers+original.charAt(i);
		}
		System.out.println(revers);
	}

}
