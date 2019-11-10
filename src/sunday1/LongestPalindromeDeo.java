package sunday1;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeDeo 
{
	public static void main(String[] args)
	{
		String s = "ABBDAB";
System.out.println(longPalindrome(s));
	}
	
	
	// Construct the longest palindrome by shuffling or deleting
	// characters from a given String
	
	public static String longPalindrome(String str)
	{

		// create a frequency map for characters of given String
		Map<Character,Integer> freq = new HashMap<Character, Integer>();
		for(char c:str.toCharArray())
		{
			freq.putIfAbsent(c,0);
			freq.put(c,freq.get(c)+1);
		}
		
		Character mid_char = null;  // stores odd character
		StringBuilder left = new StringBuilder(); // stores left subString
		
		// iterate through the frequency map
		for(Map.Entry<Character,Integer> en:freq.entrySet())
		{
			char ch = en.getKey(); // get current character
			int count =en.getValue(); // get character frequency

			// if the frequency of current character is odd
		 // update mid to current char (and discard old one)
			if(count%2==1)
			{
				mid_char = ch;
			}
			
			// append half of the characters to the left subString
		// (other half goes to the right subString in reverse order)
			for(int i=0;i<count/2;i++)
			{
				left.append(ch);
			}		
		}
		
		// right subString will be reverse of left subString
		String right = new StringBuilder(left).reverse().toString();
		
		// return String formed by the left subString, mid character (if any)
	  // and the right subString
		return (left.toString() + mid_char+right);
		
	}

}
