package wednesday19;

public class FindLargeNumber
{
	public static void main(String[] args)
	{
		int[] arry = {5,6,3,1,9};
		System.out.println(large(arry, 5));
	}
	
	public static int large(int arr[],int total)
	{
		int temp;
		
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		return arr[total-1];	
	}
}
