package thursday4;

import java.util.Arrays;

public class RemoveDuplicateArry
{
	public static void main(String[] args)
	{
	    removeDup(new int[] {1,1,1,2,3,4,5,5});	
	}
	
	public static void removeDup(int[] dup)
	{
		System.out.println("Array with duplicates...");
		System.out.println(Arrays.toString(dup));
		
		int unique = dup.length;
		for(int i=0;i<unique;i++)
		{
			for(int j = i+1;j <unique;j++)
			{
				if(dup[i]==dup[j])
				{
					dup[j] = dup[unique-1];
					unique--;
					
					j--;
				}
			}
		}
		int[] noDup = Arrays.copyOf(dup,unique);
		System.out.println("without dup....");
		for(int i=0;i <noDup.length;i++)
		{
			System.out.println(noDup[i]);
		}
		
		
	}
	

}
