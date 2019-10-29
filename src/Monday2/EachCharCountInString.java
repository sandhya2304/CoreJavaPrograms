package Monday2;

import java.util.HashMap;

public class EachCharCountInString
{

	public static void main(String[] args)
	{
		characterCount("Sandhya is here");

	}
	
	public static void characterCount(String input)
	{
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		
		char[] numb = input.toCharArray();
		
		for(char ch:numb)
		{
			if(charCount.containsKey(ch))
			{
				charCount.put(ch,charCount.get(ch)+1);
			}else
			{
				charCount.put(ch,1);
			}
			
		}
		System.out.println(charCount+" \n "+input);
		
	}

}
