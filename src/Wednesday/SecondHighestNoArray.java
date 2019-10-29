package Wednesday;

public class SecondHighestNoArray {

	public static void main(String[] args) 
	{
		
		int arr[] = {0,3,6,2,1,8,9};
		
		int largest = arr[0];
		int secondLarge = arr[0];
		
		System.out.println("the given array is:");

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t");
		}
		
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] > largest)
			{
				secondLarge = largest;
				largest = arr[i];
			}else if(arr[i] > secondLarge && arr[i] != largest)
			{
				secondLarge = arr[i];
			}
		}
		System.out.println("second largesr"+secondLarge);
		
	}

}
