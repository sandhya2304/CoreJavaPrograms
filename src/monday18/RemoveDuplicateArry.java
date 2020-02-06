package monday18;

import java.util.Arrays;

public class RemoveDuplicateArry
{
	public static void main(String[] args)
	{
		duplicateElements(new int[] {1,2,1});
	}
	
	public static void duplicateElements(int[] arryWithDup)
	{
		System.out.println("array wth duplicates....");
		for(int i=0;i<arryWithDup.length;i++)
		{
			System.out.println(arryWithDup[i]);
		}
		
		int noOfUniqueElements = arryWithDup.length;
		
		//compare each element with other elements
		for(int i=0;i<noOfUniqueElements;i++)
		{
			for(int j=i+1;j<noOfUniqueElements;j++)
			{
				if(arryWithDup[i] == arryWithDup[j])
				{
					//Replace duplicate element with last unique element
					arryWithDup[j] = arryWithDup[noOfUniqueElements-1];
					noOfUniqueElements--;
					j--;
				}
			}			
		}
		 //Copying only unique elements of arrayWithDuplicates into arrayWithoutDuplicates
		int arryWithotDup[] = Arrays.copyOf(arryWithDup,noOfUniqueElements);
		System.out.println("print array without dup....");
        for(int i=0;i<arryWithotDup.length;i++)
        {
        	System.out.println(arryWithotDup[i]);
        }
		
	}

}
