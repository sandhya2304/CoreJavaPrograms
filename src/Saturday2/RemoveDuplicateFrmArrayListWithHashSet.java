package Saturday2;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateFrmArrayListWithHashSet
{

	public static void main(String[] args)
	{
		ArrayList<String> listwithduplicate = new ArrayList<String>();
		listwithduplicate.add("sandhya");
		listwithduplicate.add("sandhya");
		
		listwithduplicate.add("sharma");
		listwithduplicate.add("abc");

		System.out.println(listwithduplicate);
		
		HashSet<String> set = new HashSet<String>(listwithduplicate);
		System.out.println(set);
		
		ArrayList<String> al = new ArrayList<String>(set);
		System.out.println(al);
		
	}

}
