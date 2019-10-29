package Wednesday2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args)
	{
		ArrayList<String> al= new ArrayList<>();
		al.add("peanut");
		al.add("banana");
		al.add("apple");	
		al.add("grapes");
		
		System.out.println(al);
		
		Collections.reverse(al);
		
		System.out.println(al);
		

	}

}
