package tuesday7;

import java.util.LinkedHashSet;

public class RemoveDuplicateSet
{
	public static void main(String[] args)
	{
		
          removeDuplicate(new int[] {1,1,1,1,2,2,2,3,4,4,5}); 
	}
	
	public static void removeDuplicate(int[] arr)
	{
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		 // adding elements to LinkedHashSet 
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		
		System.out.println(set);
	}

}
