package saturday17;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupCollection
{
	public static void main(String[] args)
	{
		removeDup(new int[] {1,2,2,3,5,5,5,6,7});
	}
	
	public static void removeDup(int arrywithDup[])
	{
		System.out.println("array with duplicates.....");
		for(int i=0;i<arrywithDup.length;i++)
		{
			System.out.print(arrywithDup[i]);
		}
		Set<Integer> set = new LinkedHashSet<>();
		
		for(int i=0;i<arrywithDup.length;i++)
		{
			set.add(arrywithDup[i]);
		}
		
		//converting set into an array
		Object[] arryWithoutDup = set.toArray();
		System.out.println("array without duplicate ");
		
		for(int i=0;i<arryWithoutDup.length;i++)
		{
			System.out.print(arryWithoutDup[i]);
		}
		
	}

}
