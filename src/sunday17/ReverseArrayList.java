package sunday17;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		
		System.out.print(al);
		Collections.reverse(al);
		
		System.out.print("after reverse :"+al);
	}

}
