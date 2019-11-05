package Tuesday5;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaximumOccuringCharacter 
{
	public static void main(String[] args)
	{
		
		maxOccuringCharacter("sandhya sharma");

	}
	
	private static void maxOccuringCharacter(String inputString)
	{
		HashMap<Character,Integer> charCountMAp = new HashMap<Character, Integer>();
		char[] charArray = inputString.replaceAll("//s+","").toCharArray();
		
		for(char c:charArray)
		{
			if(charCountMAp.containsKey(c))
			{
				charCountMAp.put(c,charCountMAp.get(c)+1);
			}else
			{
				charCountMAp.put(c,1);
			}
		}
		
		Set<Entry<Character,Integer>> entrySetMine = charCountMAp.entrySet();
		int maxCount = 0;
		char maxChar = 0;
		
		for(Entry<Character,Integer> entry:entrySetMine)
		{
			if(entry.getValue() > maxCount)
			{
				maxCount =  entry.getValue();
				maxChar = entry.getKey();
			}
			
		}
		System.out.println("Input string :"+inputString);
		System.out.println("max char and its count :"+maxChar+" : "+maxCount);
		
	}
	

}
