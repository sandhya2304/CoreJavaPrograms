package Monday;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RightRotationDemo {

	public static void main(String[] args)
	{
		rightRotate(new int[] {1,6,3,5,2,2},1);	

	}
	
	public static  void rightRotate(int[] inputArry,int numb) 
	{
		System.out.println("array before right rotation :");
		System.out.println(Arrays.toString(inputArry));
		
		int temp;
		
		for(int i=1;i<= numb;i++)
		{
			temp = inputArry[inputArry.length-1]; 
			for(int j =inputArry.length-1; j > 0;j--)
			{
				inputArry[j] = inputArry[j-1]; 
			}
			inputArry[0] = temp;
		}
		
		System.out.println("right rotation"+numb);
		System.out.println(Arrays.toString(inputArry));
		
	}
}
