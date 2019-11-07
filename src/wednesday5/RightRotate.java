package wednesday5;

import java.util.Arrays;

public class RightRotate {

	public static void main(String[] args)
	{
		
          rotateLeft(new int[] {1,6,3,4,5}, 2);
	}
	
	private static void rotateLeft(int[] arr,int n)
	{
		System.out.println("before rotatione "+Arrays.toString(arr));
		
		int temp;
		for(int i=0;i<n;i++)
		{
			temp = arr[arr.length-1];
			for(int j=arr.length-1; j > 0;j--)
			{
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
			
		}
		
		System.out.println("after rotatione "+Arrays.toString(arr));
	}
}
