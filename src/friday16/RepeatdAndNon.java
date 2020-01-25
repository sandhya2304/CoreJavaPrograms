package friday16;

import java.util.HashMap;
import java.util.Scanner;

public class RepeatdAndNon
{
	public static void main(String[] args)
	{
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the  string:");
        String input  = sc.nextLine();
		repeatwithNon(input);
		
	}
	
	public static void repeatwithNon(String input)
	{
       HashMap<Character,Integer> wordCount = new HashMap<Character, Integer>();
		
		char[] chr = input.toCharArray();
		
		for(char c:chr)
		{
			if(wordCount.containsKey(c))
			{
				wordCount.put(c,wordCount.get(c)+1);
			}else
			{
				wordCount.put(c,1);
			}
		}
		
		//check for non repeat
		for(char cc:chr)
		{
			if(wordCount.get(cc)==1)
			{
				System.out.println("non repeated character"+input+" is "+cc);
				break;
			}
		}
		
		//check for  repeat
				for(char cc:chr)
				{
					if(wordCount.get(cc) > 1)
					{
						System.out.println(" repeated character"+input+" is "+cc);
						break;
					}
				}
				
				
	}

}
