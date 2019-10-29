package Tuesday2;

import java.util.Arrays;

public class ReverseArrayNoExtraArray
{

	public static void main(String[] args)
	{
		
         reverseArray(new int[] {1,2,3,4,5,6,3,4,5,6,6,7});
	}
	
	
	public static void reverseArray(int[] inputArry)
	{
		
		System.out.println("arraya sbefore revers :"+Arrays.toString(inputArry));
		
		int temp;
		
		
		//Iterate over only half of the inputArray 
		for(int i=0;i<inputArry.length/2;i++)
		{
			
			temp = inputArry[i];
			inputArry[i] = inputArry[inputArry.length-1-i];
			inputArry[inputArry.length-1-i] = temp;
			
		}
		
		System.out.println("after revers"+Arrays.toString(inputArry));
		
	}

}
