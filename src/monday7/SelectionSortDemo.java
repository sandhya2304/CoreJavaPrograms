package monday7;

public class SelectionSortDemo
{
	public static void main(String[] args)
	{
		//combination of searching and sorting
		//position change means swap number
		
		int arr[] = {5,3,9,1,2,6};
		int min,temp = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			min = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;		
		}
		for(int i = 0;i<arr.length;i++)
		{
		    System.out.println(arr[i]+" ");	
		}
	}

}
