package Wednesday;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{

	public static void main(String[] args)
	{
		ArrayList<String> al =new ArrayList();
		al.add("sandhya");
		al.add("sharma");
		
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("advanced for loop:");
		for(Object ob:al)
		{
			System.out.println(ob);
		}
		
		System.out.println("simple for loop:");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al);
		}

	}

}
