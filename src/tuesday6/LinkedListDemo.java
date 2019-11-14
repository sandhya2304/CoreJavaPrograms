package tuesday6;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args)
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Sandhya");
		ll.add("harsh");
		ll.add("mona");
		ll.add("neha");
		
		for(String s:ll)
		{
			System.out.println(s);
		}
		
		LinkedList<String> lv = (LinkedList<String>) ll.clone();
		System.out.println(lv);
		
		ll.set(2,"sona");
		System.out.println(ll);
		
		LinkedList<String> l3 = new LinkedList<String>();
		for(String s:l3)
		{
			 l3.add(lv.contains(ll) ? "Yes" : "No");
		}
		System.out.println(l3);
		
		ArrayList<String> all = new ArrayList<String>(ll);
		System.out.println(all);

	}

}
