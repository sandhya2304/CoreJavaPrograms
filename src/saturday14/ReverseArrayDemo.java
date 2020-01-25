package saturday14;

import java.util.Arrays;

public class ReverseArrayDemo
{
	public static void main(String[] args)
	{
		
		reverseArray(new int[] {6,2,7,1,3});

	}
	
	public static void reverseArray(int input[])
	{
		System.out.println("arrays before reverse"+Arrays.toString(input));
		int temp;
		
		 for(int i=0;i<input.length/2;i++)
		 {
			 temp = input[i];
			 input[i] = input[input.length-1-i];
			 input[input.length-1-i] = temp;
		 }
		 System.out.println("arrays after reverse"+Arrays.toString(input));
	}
}
