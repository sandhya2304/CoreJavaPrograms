package wednesday19;

public class SecondLarge
{
	public static void main(String[] args)
	{
		int arr[] = {5,6,9,1,23,3};
		System.out.println(secondLarge(arr, 6));

	}
	
	public static int secondLarge(int arry[],int total)
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
		return arry[total-3];
	}

}
