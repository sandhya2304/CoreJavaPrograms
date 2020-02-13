package wednesday19;

import java.util.Arrays;

public class LargeNumberUsingArrays
{
	public static void main(String[] args)
	{
		int arry[] = {5,6,3,1,2};
		System.out.println(large(arry,5));

	}
	
	public static int large(int arr[],int total)
	{
		Arrays.sort(arr);
		
		return arr[total-1];
	}

}
