package tuesday18;

import java.util.Arrays;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		reverse(new int[] {1,2,3,4,5,6});
	}
	
	public static void reverse(int[] arry)
	{
		System.out.println("berfore reverse"+Arrays.toString(arry));
		int temp;
		
		for(int i=0;i<arry.length/2;i++)
		{
			temp = arry[i];
			arry[i] = arry[arry.length-1-i];
			arry[arry.length-1-i] = temp;
		}
		System.out.println("after reverse"+Arrays.toString(arry));
	}

}
