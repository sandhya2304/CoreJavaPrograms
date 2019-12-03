package tuesday9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapList
{
	
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		list.add("Sandhya");
		list.add("harsh");
		list.add("sharma");
		
		System.out.println(list);
		Collections.swap(list,2,1);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
	}

}
