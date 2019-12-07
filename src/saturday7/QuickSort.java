package saturday7;

public class QuickSort
{
	public static void main(String[] args) 
	{
		int arr[] = {6,4,9,2,5,1,99,33};
		
		int len = arr.length;
		
		QuickSort q = new QuickSort();
		q.quicksortPartition(arr, 0,len-1);
		
		for(int i : arr)
		{
			System.out.println(i);
		}
	}
	
	public int partition(int arr[],int low,int high)
	{
		int pivot = arr[(low+high)/2];
		
		while(low <= high)
		{
			while(arr[low] < pivot)
			{
				low++;
			}
			while(arr[high] > pivot)
			{
				high--;
			}
			if(low <= high)
			{
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				
				low++;
				high--;
			}	
		}
		return low;
	}
	
	public void quicksortPartition(int arr[],int low,int high)
	{
		int pi = partition(arr, low, high);
		
		if(low < pi-1)
		{
			quicksortPartition(arr, low, pi - 1);
		}if(pi < high)
		{
			quicksortPartition(arr, pi, high);
		}
		
	}
	
	
	

}
