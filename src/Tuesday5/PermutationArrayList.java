package Tuesday5;

import java.util.ArrayList;

public class PermutationArrayList
{
	public static void main(String[] args)
	{
		String str = "abcdef";
		System.out.println(getPermutation(str));
	}
	
	public static ArrayList<String> getPermutation(String str)
	{
		
		//if string is empty 
		if(str.length() == 0)
		{
			//return an empty arraylist
			ArrayList<String> empty = new ArrayList<String>();
			empty.add("");
			return empty;
			
		}
		
		//take first character of str
		char ch =  str.charAt(0);
		String subStr = str.substring(1);
		
		//recursiveCall
		ArrayList<String> prevList = getPermutation(subStr);
		
		
		ArrayList<String> res = new ArrayList<String>();
		for(String s:prevList)
		{
			for(int i = 0; i <= s.length();i++)
			{
				res.add(s.substring(0,i)+ch+s.substring(i));
			}
		}
		
		return res;
		
	}


}
