package sunday17;

import java.sql.Array;
import java.util.Arrays;

public class LeftRotateArry 
{

	public static void main(String[] args)
	{
		leftRotate(new int[] {1,2,3,5,6,7}, 3);
		

	}
	
	public static void leftRotate(int []arry,int n)
	{
		System.out.println("before rotation : "+Arrays.toString(arry));
		int temp;
		
		for(int i=0;i<n;i++)
		{
			temp = arry[0];
			
			for(int j=0;j<arry.length-1;j++)
			{
				arry[j] = arry[j+1];
			}
			arry[arry.length-1] = temp;
		}
		System.out.println("array rotaton from "+n+ " rotate "+Arrays.toString(arry));
	}
}
