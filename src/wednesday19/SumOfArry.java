package wednesday19;

public class SumOfArry 
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,5,6,7};
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum = sum+arr[i];
		}

		System.out.println(sum);
	}

}
