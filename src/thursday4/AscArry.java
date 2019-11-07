package thursday4;

import java.util.Arrays;

public class AscArry 
{
	public static void main(String[] args) 
	{
		
		int arry[] = {9,7,6,5,4,3,2,1};
		
		int temp = 0;
		
		System.out.print(Arrays.toString(arry));
		
		for(int i =0; i < arry.length;i++)
		{
			for(int j = i+1;j < arry.length;j++)
			{
				if(arry[i] > arry[j])
				{
					temp = arry[i];
					arry[i] = arry[j];
					arry[j] = temp;
							
				}
			}
			
		}
		System.out.print(Arrays.toString(arry));
		

	}

}
