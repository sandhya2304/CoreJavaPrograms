package Thursday6;

public class BinarySearchDemo
{
	public static void main(String[] args)
	{
		//list must be sorted in binary search
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		int item = 91;
		int li = 0;
		int hi = arr.length-1;
		int mi  = (li+hi)/2;
		
		while(li <= hi)
		{
			if(arr[mi] == item)
			{
				System.out.println("item found at index "+mi+" item is "+item);
				break;
			}else if(arr[mi] <= item)
			{
				li = mi+1;				
			}else
			{
				hi = mi-1;
			}
			mi = (li+hi)/2;			
		}if(li > hi)
		{
			System.out.println("item not found.."+item);
		}

	}

}
