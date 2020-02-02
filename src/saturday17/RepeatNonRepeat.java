package saturday17;

import java.util.HashMap;

public class RepeatNonRepeat
{
	public static void main(String[] args)
	{
		repeatNon("sandhya");	
	}
	
	public static void repeatNon(String input)
	{
		HashMap<Character,Integer> wordCount = new HashMap<Character, Integer>();
		char[] ch = input.toCharArray();
		
		for(char c:ch)
		{
			if(wordCount.containsKey(c))
			{
				wordCount.put(c,wordCount.get(c)+1);
			}else
			{
				wordCount.put(c,1);
			}		
		}
		System.out.print(wordCount);
		System.out.println("----------------------------------");
		
		//non repeat
		for(char cc:ch)
		{
			if(wordCount.get(cc)==1)
			{
				System.out.println(cc);
			}
		}
		System.out.println("----------------------------------");
		//non repeat
				for(char cc:ch)
				{
					if(wordCount.get(cc) > 1)
					{
						System.out.println(cc);
					}
				}
		
	}

}
