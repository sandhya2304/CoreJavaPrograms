package monday8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatChar
{
	public static void main(String[] args)
	{	
		char c = NonRepeatedChar("aabbcccd");
		System.out.println(c);
	}
	
	public static char NonRepeatedChar(String s)
	{
		
		Map<Character,Integer> countMap = new LinkedHashMap<Character, Integer>(s.length());
		for(char cc:s.toCharArray())
		{
			countMap.put(cc,countMap.containsKey(cc) ? countMap.get(cc)+1 : 1);
		}
		
		System.out.println(countMap);
		
		for(Entry<Character,Integer> entry:countMap.entrySet())
		{
			if(entry.getValue() == 1)
			{
				return entry.getKey();
			}
		}
		
		throw new RuntimeException("number not repeted");
	}
	

}
