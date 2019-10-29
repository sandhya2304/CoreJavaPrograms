package Friday2;

import java.util.Arrays;

public class SeprateZerofrmNonZero2 
{

	public static void main(String[] args)
	{
		
		 moveZeroToFront(new int[] {5,5,5,3,3,30,0,0,0,5,5,5,0,0,3,33,3,1});

	}
	
	public static void moveZeroToFront(int input[])
	{
		 //Initializing counter to position of last element
		int counter = input.length-1 ;
		
		 //Traversing the inputArray from right to left
		for(int i = input.length-1;i > 0 ;i--)
		{
			//If inputArray[i] is non-zero
			if(input[i]!=0)
			{
				//Assigning inputArray[i] to inputArray[counter]
				input[counter] = input[i];
				
				  //Decrementing the counter by 1
				 
				counter--;
			}
			
		}
		//Assigning 0 to remaining elements
		while(counter >= 0)
		{
			input[counter] = 0;
			counter--;
		}
		
		System.out.println(Arrays.toString(input));
		
	}
	

}
