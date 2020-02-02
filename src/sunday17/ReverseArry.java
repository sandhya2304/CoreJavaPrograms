package sunday17;

import java.util.Arrays;

public class ReverseArry
{
	public static void main(String[] args)
	{
		reverseArray(new int[] {1,2,3,4,5,6});
	}
	
	public static void reverseArray(int arry[])
	{
		System.out.println("Before Reverse "+Arrays.toString(arry));
		int temp;
		
		for(int i =0;i < arry.length/2;i++)
		{
			temp = arry[i];
			arry[i] = arry[arry.length-1-i];
			arry[arry.length-1-i] = temp;
		}
		System.out.println("After Reverse "+Arrays.toString(arry));
	}

}
