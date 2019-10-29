package Friday2;

import java.util.Arrays;

public class FindAllLeaders
{

	public static void main(String[] args) 
	{
         AllLeaders(new int[] {12, 9, 7, 14, 8, 6, 3});		
	}
	
	
	public static void AllLeaders(int inputArry[])
	{
		
		System.out.println("the leaders in :"+Arrays.toString(inputArry)+" are :");
		for(int i = 0;i < inputArry.length;i++)
		{
			boolean flag = true;
			
			for(int j = i+1;j<inputArry.length;j++)
			{
				if(inputArry[j] > inputArry[i])
				{
					flag = false;
					break;
				}
				
			}
			if(flag)
			{
				System.out.println(inputArry[i]);
			}
			
		}
		
		
		
	}
	

}
