package wednesday16;

import java.util.HashMap;
import java.util.Set;

public class MostRepeatedCharacter
{
	public static void duplicateCount(String word)
	{
		HashMap<Character,Integer> charCountMap = new HashMap<Character, Integer>();
		
		char[] ch = word.toCharArray();
		
		for(char c:ch)
		{
			if(charCountMap.containsKey(c))
			{
				charCountMap.put(c, charCountMap.get(c)+1);
			}else
			{
				charCountMap.put(c,1);
			}
		}
		
		
		Set<Character> set = charCountMap.keySet();
		System.out.println("duplicate charatcer"+charCountMap);
		
		for(Character chh:set)
		{
			if(charCountMap.get(chh) > 1)
			{
				System.out.println(chh+ " : "+charCountMap.get(chh));
			}
		}
		
	}
	
	
	public static void main(String[] args)
	{
		duplicateCount("sandddhya");
		
	}

}
