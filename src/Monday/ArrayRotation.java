package Monday;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args)
	{
		leftRotate(new int[] {1,6,3,5,2,2},3);	

	}
	
	
	public static void leftRotate(int[] inputArry,int numb)
	{
		
		System.out.println("Input array before rotation:");
		System.out.println(Arrays.toString(inputArry));
		
		int temp;
		
		for(int i=0;i<numb;i++)
		{
			temp = inputArry[0];
			for(int j = 0;j<inputArry.length-1;j++)
			{
				inputArry[j] = inputArry[j+1];
			}
			inputArry[inputArry.length-1] = temp;
		}
		System.out.println("array after left rotation"+numb+"posisiton");
		System.out.println(Arrays.toString(inputArry));
	}

}
