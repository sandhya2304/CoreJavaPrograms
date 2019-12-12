package thursday9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateString
{
	public static void main(String[] args)
	{
		
		duplicate("sandhya");

	}
	
	public static void duplicate(String s)
	{
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		char[] ch = s.toCharArray();
		
		for(char c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
				
			}else
			{			
				map.put(c,1);
			}
		}
		System.out.println(map);
		Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
		for(Entry<Character,Integer> entry:entrySet)
		{
			if(entry.getValue() > 1)
			{
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}
		
		
	}
	

}
