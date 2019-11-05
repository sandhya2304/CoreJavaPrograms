package Tuesday5;

import java.util.HashMap;
import java.util.Set;

public class DuplicateStringHashMap
{
	public static void main(String[] args)
	{
		duplciateString("sandhyasharma");
	}

	public static void duplciateString(String input)
	{
		HashMap<Character,Integer> charCountMap = new HashMap<Character, Integer>();
		
		char[] ch =input.toCharArray();
		
		for(char c:ch)
		{
			if(charCountMap.containsKey(c))
			{
				charCountMap.put(c,charCountMap.get(c)+1);
			}else
			{
				charCountMap.put(c, 1);
			}			
		}
	//	System.out.print(charCountMap);
		
		//Getting a Set containing all keys of charCountMap
		Set<Character> charInStruing = charCountMap.keySet();
		System.out.println("diplicate string "+charInStruing);
		
		// //Iterating through Set 'charsInString'
		for(Character c : charInStruing)
		{
			if(charCountMap.get(c) > 1)
			{
			
				System.out.println(c+" : "+charCountMap.get(c));
			}
		}
		
		
		
	}
	
}
