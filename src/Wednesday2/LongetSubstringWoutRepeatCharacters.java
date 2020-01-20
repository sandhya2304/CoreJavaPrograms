package Wednesday2;

import java.util.LinkedHashMap;

public class LongetSubstringWoutRepeatCharacters
{

	public static void main(String[] args)
	{
		
		longestSubstring("sandhyaishere");

	}
	
	
	public static void longestSubstring(String inputSubstring)
	{
		
		//Convert inputString to charArray
		char[] charArray = inputSubstring.toCharArray();
		
		
		//Initialization
		String longSubstring = null;
		int longSubstringLength = 0;
		
		
		//Creating LinkedHashMap with characters as keys and their position as values.
		LinkedHashMap<Character,Integer> charPosMap = new LinkedHashMap<Character, Integer>();
		
		 //Iterating through charArray
		for(int i = 0;i < charArray.length;i++)
		{
			char ch = charArray[i];
			
			
		//If ch is not present in charPosMap, adding ch into charPosMap along with its position
			if(!charPosMap.containsKey(ch))
			{
				charPosMap.put(ch,i);
			}
			
			//If ch is already present in charPosMap, reposioning the cursor i to the position 
			//of ch and clearing the charPosMap
			else
			{
				i = charPosMap.get(ch);
				charPosMap.clear();
			}
			
			
			//Updating longestSubstring and longestSubstringLength
			if(charPosMap.size() > longSubstringLength)
			{
				longSubstringLength = charPosMap.size();
				longSubstring = charPosMap.keySet().toString();
			}			
		}
		System.out.println("Input string  : "+inputSubstring);
		System.out.println("longest substring :"+longSubstring);
		System.out.println("longest substring length :"+longSubstringLength);
		
	}
	

}
