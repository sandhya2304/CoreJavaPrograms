package tuesday7;

import java.util.Collections;
import java.util.Vector;

public class SortArryNoPositonChng {

	public static void main(String[] args)
	{
		int[] a = { 2, -6, -3, 8, 4, 1 };
        int b = a.length;
		sortArrya(a, b);
		
	}
	
	public static void sortArrya(int[] arr,int n)
	{
		
		 // Store all non-negative values 
		Vector<Integer> nonneg = new Vector<Integer>();
		for(int i=0;i < n;i++)
		{
			if(arr[i] >=0)
			{
				nonneg.add(arr[i]);
			}
		}
		
		//sort non neg values
		Collections.sort(nonneg);
		System.out.print(nonneg);
		
		int j = 0;
		for(int i=0 ; i < n;i++)
		{
			// If current element is non-negative then 
	        // update it such that all the 
	        // non-negative values are sorted 
			if (arr[i] >= 0)
			{
				arr[i] = nonneg.get(j);
				j++;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
