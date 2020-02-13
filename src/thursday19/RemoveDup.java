package thursday19;

import java.util.Arrays;

public class RemoveDup
{
	public static void main(String[] args) 
	{
		removeDupli(new int[] {1,1,2,3,4});	
	}
	
	public static void removeDupli(int arry[])
	{
		System.out.println("Arry with dup..");
		for(int i=0;i<arry.length;i++)
		{
			System.out.println(arry[i]);
		}
		int noOfUnique = arry.length;
		for(int i =0;i<noOfUnique;i++)
		{
			for(int j=i+1;j<noOfUnique;j++)
			{
				if(arry[i] == arry[j])
				{
					arry[j] = arry[noOfUnique-1];
					noOfUnique--;
					j--;
				}
			}
		}
		
		int arryWithotDup[] = Arrays.copyOf(arry,noOfUnique);
		System.out.println("without dupl");
		for(int i=0;i<arryWithotDup.length;i++)
		{
			System.out.println(arryWithotDup[i]);
		}
		
	}

}
