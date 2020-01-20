package saturday9;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("sandhya");
		al.add("mona");
		al.add("abc");
		
		System.out.println(al);

		Collections.reverse(al);
		
		System.out.println(al);
		
		System.out.println(al.indexOf("mona"));
		
		System.out.println(al.get(2));
		
		System.out.println(al.set(0,"love"));
		System.out.println(al);
	}

}
