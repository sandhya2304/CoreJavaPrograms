package saturday7;

public class LinearSearch
{
	public static void main(String[] args)
	{
		
		int arr[] = {6,4,9,2,5,1,99,33};
		
		int item = 99;
		int temp = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i] == item)
			{
				System.out.println(i+" ");
			    temp = temp+1;
			}
		}
		if(temp == 0)
		{
			System.out.println("item not found" +item);
		}
		

	}

}
