package Friday2;

import java.util.Arrays;

public class SeprateZerosFromNonZeros
{

	public static void main(String[] args)
	{
		
		moveZeroToEnd(new int[] {2,3,4,5,7,87,90,8,0,0,0,0,3,3,3,});

	}
	
	public static void moveZeroToEnd(int inputArry[])
	{
		
		//Initializing counter to 0
		int counter = 0;
		for(int i = 0;i<inputArry.length;i++)
		{
			//If inputArray[i] is non-zero
			if(inputArry[i]!=0)
			{
				//Assigning inputArray[i] to inputArray[counter]
				inputArry[counter] = inputArry[i];
				 //Incrementing the counter by 1
				 counter++;				
			}
			
		}
		//Assigning zero to remaining elements
		while(counter < inputArry.length)
		{
			inputArry[counter] = 0;
			counter++;
		}
		
		System.out.println(Arrays.toString(inputArry));
	}

}
