package Saturday2;

import java.util.Arrays;
import java.util.HashSet;

public class CommonElementsRetainAll
{

	public static void main(String[] args)
	{
		
		Integer[] i1= {1,2,3,4,4,5,6,5,5};
		Integer[] i2= {2,3,4,4,5,6,5,5};
		
		HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(i1));
		HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(i2));
		set1.retainAll(set2);
		
		System.out.println(set1);

	}

}
