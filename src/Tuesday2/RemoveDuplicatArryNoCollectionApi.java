package Tuesday2;

import java.util.Arrays;

public class RemoveDuplicatArryNoCollectionApi
{
	public static void main(String[] args)
	{
		 removeDuplicates(new int[] {1,2,2,3,4,5,6,7,1});
         
	}

	
	public static void removeDuplicates(int[] arryWithDuplicates)  
	{
		
		System.out.println("Array with duplicates : print here");
		for(int i=0; i<arryWithDuplicates.length;i++)
		{
			System.out.print(arryWithDuplicates[i] +"\t");
		}
		
		   //Assuming all elements in input array are unique
	       
		int noOfUniqueElements = arryWithDuplicates.length;
		
		 //Comparing each element with all other elements
		
		for(int i=0;i<noOfUniqueElements;i++)
		{
			for(int j =i+1; j <noOfUniqueElements ;j++)
			{
				 //If any two elements are found equal
				if(arryWithDuplicates[i] ==  arryWithDuplicates[j])
				{
					//Replace duplicate element with last unique element
					
					 arryWithDuplicates[j] = arryWithDuplicates[noOfUniqueElements-1];
					 
					//Decrementing noOfUniqueElements
					 noOfUniqueElements--;
					 
					 j--;
				}	
			}	
		}
		
		//Copying only unique elements of arrayWithDuplicates into arrayWithoutDuplicates
		
		int[] arryWithoutDuplicates = Arrays.copyOf(arryWithDuplicates,noOfUniqueElements);
		
		System.out.println();
		
		System.out.println("Array without duplicate print :");
		for(int i=0;i<arryWithoutDuplicates.length;i++)
		{
			System.out.print(arryWithoutDuplicates[i]+"\t");
		}
		System.out.println();
		
		
	}
	
	
	
	
}
