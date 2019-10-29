package Friday2;

import java.util.Arrays;

public class FindLeaders
{

	public static void main(String[] args) 
	{
		
         findLeaders(new int[] {12, 9, 7, 14, 8, 6, 3});
		
	}
	
	public static void findLeaders(int inputString[])
	{
		 //Getting the length of input array		 
		int inputArryLength = inputString.length;
		
		  //Assuming the last element as max
		int max = inputString[inputArryLength-1];
		
		System.out.println("the leaders in :"+Arrays.toString(inputString) +" are :");
		
		 //Traversing the remaining elements from right to left
		for(int i =inputString.length-2; i >=0;i--)
		{
			 //If the element is greater than max
			if(inputString[i] > max)
			{
				//Printing the element
				System.out.println(inputString[i]);
			
				//Updating the max
				max = inputString[i];
			}
			
		}
		
		
	}
	
	

}
