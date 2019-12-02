package sunday5;

import java.util.ArrayList;

public class CompareArrayList
{
	public static void main(String[] args)
	{
	
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("sandhya");
		al1.add("harsh");
		al1.add("abcww");
		al1.add("efg");
		  
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("sandhya");
		al2.add("harsh");
		al2.add("abc");
		al2.add("efg");
		
		ArrayList<String> al3 = new ArrayList<String>();
		
		///List<String> ll = al1.subList(0, 4);
		//System.out.println(ll);
		
		
		for(String s:al1)
		{
			al3.add(al2.contains(s)? "yes" : "no");		
		}	
		System.out.println(al3);

	}

}
