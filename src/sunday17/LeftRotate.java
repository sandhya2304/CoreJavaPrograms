package sunday17;

import java.util.Arrays;

public class LeftRotate
{
	public static void main(String[] args)
	{
		rightRotate(new int[] {1,2,3,4,5,6,7,9}, 3);
	}
	
	public static void rightRotate(int []arry,int n)
	{
		System.out.println("before rightRotate"+Arrays.toString(arry));
		int temp;
		
		for(int i=0;i <= n;i++)
		{
			temp = arry[arry.length-1];
			for(int j= arry.length-1; j > 0;j--)
			{
				arry[j] = arry[j-1];				
			}			
			arry[0] = temp;
		}
		System.out.println("after left rotate "+n+" position "+Arrays.toString(arry));
	}

}
