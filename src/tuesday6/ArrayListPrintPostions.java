package tuesday6;

import java.util.ArrayList;

public class ArrayListPrintPostions 
{
	public static void main(String[] args)
	{
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("orange");
		al.add("apple");
		al.add("banana");
		
		for(String a:al)
		{
			System.out.println(a);
		}
		
		al.set(1,"sandhya");
		System.out.println("------------------");
		for(String a:al)
		{
			System.out.println(a);
		}
		
		System.out.println(al.isEmpty());
		int noOfElements = al.size();
		for(int i=0;i<noOfElements;i++)
		 System.out.println(al.get(i));

	}

}
