package thursday9;

import java.io.CharConversionException;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate
{
	public static void main(String[] args)
	{
		
		String word = "sandhya";
		System.out.println(removeDuplicate(word));

	}
	public static String removeDuplicate(String s)
	{
		Set<String> set = new HashSet<String>();
		StringBuffer buffer = new StringBuffer();
		
		for(int i=0;i<s.length();i++)
		{
			char[] c = s.toCharArray();
			
			if(!set.contains(c))
			{
				set.add(s);
				buffer.append(c);
			}
		}
		return buffer.toString();
	}
	
	
	

}
