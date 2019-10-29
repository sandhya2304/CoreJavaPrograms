package Saturday2;

import java.util.Arrays;

public class SubArrayWhoseSumIsNumber
{

	public static void main(String[] args)
	{
		
		SubArray(new int[]{1,2,3}, 6);

	}
	
	public static void SubArray(int[] inputArry,int inputNumber)
	{
		//Initializing sum with the first element of the inputArray
		int sum = inputArry[0];
		
		//Initializing starting point with 0
		int start = 0;
		
		//Iterating through inputArray starting from second element
		for(int i=1;i < inputArry.length;i++)
		{
			 //Adding inputArray[i] to the current 'sum'
			sum = sum + inputArry[i];
	
			 //If sum is greater than inputNumber then following loop is executed until			 
            //sum becomes either smaller than or equal to inputNumber
			while(sum > inputNumber && start <= i-1)
			{
				//Removing starting elements from the 'sum'
				sum = sum - inputArry[start];
				start++;
			}

			 //If 'sum' is equal to 'inputNumber' then printing the sub array
			if(sum == inputNumber)
			{
				 System.out.println("continu sub array"+Arrays.toString(inputArry)+"\n whose sum is:"+inputNumber+" is ");
				 
				 for(int j = start;j<= i;j++)
				 {
					 System.out.print(inputArry[j]+" ");
				 }
				 System.out.println();
			}
			
		}
		
	}
	

}
