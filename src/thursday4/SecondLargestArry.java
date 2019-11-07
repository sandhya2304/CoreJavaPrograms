package thursday4;

public class SecondLargestArry
{
	public static void main(String[] args) 
	{
		
		System.out.println(secondLArgest(new int[] {1,3,5,6,7,9}, 6));

	}
	public static int secondLArgest(int arry[],int total)
	{
		
		int temp;
		
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(arry[i] > arry[j])
				{
					temp = arry[i];
					arry[i] = arry[j];
					arry[j] = temp;
				}
			}
			
		}
		return arry[total-2];
		
		
		
	}
	
	

}
