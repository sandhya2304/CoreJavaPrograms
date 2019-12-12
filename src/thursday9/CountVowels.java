package thursday9;

import java.util.Scanner;

public class CountVowels 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = sc.next();
		
		char[] c = word.toCharArray();
		
		int count = 0;
		
		for(char ch:c)
		{
			switch(ch)
			{
			case 'a':
			case 'e':	
			case 'i':
			case 'o':
			case 'u':
			  count++;
				break;
			}
			
		}
		System.out.println(count);

		if(count == 0)
		{
			System.out.println("no vowels..");
		}
		
	}

}
