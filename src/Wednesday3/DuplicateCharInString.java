package Wednesday3;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharInString 
{

	public static void main(String[] args)
	{
		
		duplicateCharCount("sandhhhya");

	}
	
	public static void duplicateCharCount(String words)
	{
		HashMap<Character,Integer> charCount = new HashMap<Character, Integer>();
		
		char[] ch = words.toCharArray();
		 
		 for(char c:ch)
		 {
			 if(charCount.containsKey(c))
			 {
				 charCount.put(c,charCount.get(c)+1);
			 }else
			 {
				 charCount.put(c,1);
			 }
					 
		 }
		
		 System.out.println(charCount);
		 
		 ////Getting a Set containing all keys of charCountMap
		 Set<Character> charsInString = charCount.keySet();
		 System.out.println("duplicate hcaracters in string are = "+words);
		 for(Character ss:charsInString)
		 {
			 if(charCount.get(ss) > 1)
			 {
				//If any char has a count of more than 1, printing it's count
				 System.out.println(ss+" counts are" +charCount.get(ss));
			 }
		 }
		 
		
	}

}
