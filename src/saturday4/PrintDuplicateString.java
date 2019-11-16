package saturday4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateString
{
	public static void main(String[] args)
	{
		String str = "harsh"; 
		displayDup(str);
	}
	
	public static void displayDup(String s)
	{
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		char[] c = s.toCharArray();
		
		for(char ch :c)
		{
			if(!map.containsKey(ch))
			{
				map.put(ch,1);
			}else
			{
				map.put(ch,map.get(ch)+1);
			}
			
		}
		Set<Map.Entry<Character,Integer>> set = map.entrySet();
		for(Map.Entry<Character,Integer> mm :set)
		{
			if(mm.getKey() > 1)
			{
				System.out.println(mm.getKey()+" : "+mm.getValue());
			}
		}
	}
	

}
