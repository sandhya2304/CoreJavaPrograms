package saturday6;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortingAscDesc 
{
	public static void main(String[] args)
	{
		
		String arry[] = {"g","z","d","p","w"};
		
		System.out.println("before sorting.....");
		
		for(String i:arry)
		{
			System.out.println(i);
		}
		
		Arrays.sort(arry);
		
      System.out.println("after sorting.....");
		
		for(String i:arry)
		{
			System.out.println(i);
		}
		
		Arrays.sort(arry,Collections.reverseOrder());
		
	}

}
