package thursday4;

public class ThirdLargestArry
{
	public static void main(String[] args) 
	{
		
		System.out.println(thirdLargest(new int[] {1,2,3,4,5,7}, 6));
		

	}
	
	public static int thirdLargest(int[] arry,int total)
	{
		int temp = 0;
		
		for(int i=0;i < total;i++)
		{
			for(int j=i+1;j<0;j++)
			{
				if(arry[i] > arry[j])
				{
					temp = arry[i];
					arry[i] = arry[j];
					arry[j] = temp;
				}
			}
		}
		return arry[total-4];
		
	}

}
