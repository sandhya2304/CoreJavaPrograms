package Tuesday;

import java.util.Scanner;

public class RevserSplit {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String words = sc.nextLine();
		
		String token[] = words.split("");
		
		for(int i = token.length-1; i >= 0;i--)
		{
			System.out.println(token[i]);
		}

	}

}
