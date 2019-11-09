package saturday3;

import java.util.Collections;
import java.util.Vector;

public class SortArryNoNegPositionChnge
{
	public static void main(String[] args)
	{
		int[] a= { 2, -6, -3, 8, 4, 1 }; 
		int n = a.length;
		sortArry(a ,n);

	}
	
	public static void sortArry(int[] arry,int n)
	{
		Vector<Integer> ans = new Vector<Integer>();
		for(int i=0;i < n;i++)
		{
			if(arry[i] >= 0)
			ans.add(arry[i]);
		}
		
		Collections.sort(ans);
		
		int j= 0;
		for(int i=0;i<n;i++)
		{
			if(arry[i] >=0)
			{
				arry[i] = ans.get(j);
				j++;
			}
		}
		
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arry[i]+" ");
		}
		
		
		
		
	}
	
	

}
