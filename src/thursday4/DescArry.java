package thursday4;

import java.util.Arrays;

public class DescArry 
{
	public static void main(String[] args) 
	{
		
        int arry[] = {1,2,3,4,5,6,8};
		
		int temp = 0;
		
		System.out.print(Arrays.toString(arry));
		for(int i=0;i < arry.length;i++)
		{
			for(int j=i+1;j < arry.length;j++)
			{
				if(arry[i] < arry[j])
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
