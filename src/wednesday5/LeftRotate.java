package wednesday5;

import java.util.Arrays;

public class LeftRotate {

	public static void main(String[] args)
	{
		rotateLeft(new int[] {1,1,2,3,4,4,4}, 3);
	}
	
	private static void rotateLeft(int[] arry,int n)
	{
		System.out.println("before rotation :");
		System.out.println(Arrays.toString(arry));
		
		int temp;
		
		for(int i=0;i<n;i++)
		{
			temp = arry[0];
			
			for(int j=0;j < arry.length-1;j++)
			{
				arry[j] = arry[j+1];
			}
			arry[arry.length-1] = temp;
			
		}
		System.out.println("after rotaion with "+n+"positions");
		System.out.println("after rotation"+Arrays.toString(arry));
		
	}
}
