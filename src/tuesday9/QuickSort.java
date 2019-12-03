package tuesday9;

public class QuickSort
{
	public static void main(String[] args)
	{
		int arry[] = {6,2,9,3,1,99,4};

		int len = arry.length;
		QuickSort qq =new QuickSort();
		qq.quickSortPartiton(arry, 0,len-1);
		
		for(int i:arry)
		{
			System.out.println(i+" ");
		}
		
	}
	
	public int partition(int []aa,int low,int high)
	{
		int pivot = aa[(low+high)/2];
		while(low <= high)
		{
			while(aa[low]<pivot)
			{
				low++;
			}
			while(aa[high]>pivot)
			{
				high--;
			}
			if(low <= high)
			{
				int temp  = aa[low];
				aa[low] = aa[high];
				aa[high] = temp;
				
				low++;
				high--;
			}
			
		}
		return low;		
	}
	
	public void quickSortPartiton(int arr[],int low,int high)
	{
		int pi = partition(arr, low, high);
		
		if(low < pi-1)
		{
			quickSortPartiton(arr, low,pi-1);
		}
		if(pi < high)
		{
			quickSortPartiton(arr,pi, high);
		}
		
	}
	
	

}
