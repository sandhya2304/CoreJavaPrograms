package saturday7;

public class BinarySearch
{
	public static void main(String[] args)
	{
		int arr[] = {6,4,9,2,5,1,99,33};
		
		int item  = 99;
		
		int li = 0;
		int hi = arr.length-1;
		int mi = (li+hi)/2;
		
		while(li <= hi)
		{
			if(arr[mi] ==item)
			{
				System.out.println("number is at position "+mi);
				break;
			}else if(arr[mi] <= hi)
			{
				li = mi + 1;
			}else
			{
				hi = mi-1;
			}	
			mi = (li+hi)/2;
		}
		if(li > hi)
		{
			System.out.println("number not found");
		}
		
	}

}
