package tuesday19;

import java.util.Arrays;

public class FindLeaders
{
	public static void main(String[] args)
	{
		
		leaders(new int[] {5,3,9,6,2,1});

	}
	// An element is said to be leader if all the elements on it’s right side
	//are smaller than it. Rightmost element is always a leader. 
	public static void leaders(int inputArry[])
	{
		int inputArryLength = inputArry.length;
		
		int max = inputArry[inputArryLength-1];
		System.out.println("the leaders "+Arrays.toString(inputArry)+" are ");
		
		//Printing the last element as it is always a leader
		System.out.println(inputArry[inputArryLength-1]);
		
		for(int i=inputArry.length-2;i>=0;i--)
		{
			if(inputArry[i] > max)
			{
				System.out.println(inputArry[i]);
				max = inputArry[i];
			}
			
		}
		
		
	}

}
