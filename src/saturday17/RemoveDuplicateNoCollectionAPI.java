package saturday17;

import java.util.Arrays;

public class RemoveDuplicateNoCollectionAPI
{
	public static void main(String[] args)
	{
		removeDplicate(new int[] {1,1,2,3,5,6} );
	}
	
	public static void removeDplicate(int []arryDup)
	{
		
		System.out.println("Array with duplicates ");
		for(int i=0;i<arryDup.length;i++)
		{
			System.out.println(arryDup[i]);
		}
		
		int noOfUniqueElemnets = arryDup.length;
		for(int i=0;i<noOfUniqueElemnets;i++)
		{
			for(int j=i+1;j<noOfUniqueElemnets;j++)
			{
				if(arryDup[i] == arryDup[j])
				{
					arryDup[j] = arryDup[noOfUniqueElemnets-1];
					noOfUniqueElemnets--;
					j--;
				}
			}
		}
		//Copying only unique elements of arrayWithDuplicates into arrayWithoutDuplicates
		int[] arryWithoutDup = Arrays.copyOf(arryDup,noOfUniqueElemnets);
		System.out.println();
		System.out.println("Array without duplicates ");
		for(int i=0;i<arryWithoutDup.length;i++)
		{
			System.out.println(arryWithoutDup[i]+"");
		}
		System.out.println();
		
	}

}
