package saturday4;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateString
{
	public static void main(String[] args)
	{
		String words = "sandhya";
		System.out.println(removeDuplicate(words));
		

	}
	
	public static String removeDuplicate(String s)
	{
	   Set<String> set = new HashSet<String>();
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i<s.length();i++)
		{
			Character c = s.charAt(i);
			if(!set.contains(c))
			{
				set.add(s);
				sb.append(c);
			}
			
		}
		return sb.toString();
		
	}

}
