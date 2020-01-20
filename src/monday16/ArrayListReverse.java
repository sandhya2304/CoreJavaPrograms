package monday16;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse
{
	public static void main(String[] args)
	{
        ArrayList<String> al = new ArrayList<String>();
        al.add("abc");
		al.add("def");
		al.add("ghi");

		Collections.reverse(al);
		System.out.println(al);
		
	}

}
