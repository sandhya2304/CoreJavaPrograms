package friday10;

public class QuickSort 
{

	public static void main(String[] args)
	{
		int arry[] = {6,3,9,1,2,32,7,93,75};

		int len = arry.length;
		
		QuickSort qq = new QuickSort();
		qq.quickPartition(arry, 0, len-1);
		
		for(int i:arry)
		{
			System.out.println(i+" ");
		}
		
	}
	
	public int partition(int arry[],int low,int high)
	{
		int pivot = arry[(low+high)/2];
		
		while(low <= high)
		{
			while(arry[low] < pivot)
			{
				low++;
			}
			while(arry[high] > pivot)
			{
				high--;
			}
			if(low <= high)
			{
				int temp = arry[low];
				arry[low] = arry[high];
				arry[high] = temp;
				
				low++;
				high--;				
			}
		}
		return low;
	}
	
	public void quickPartition(int arry[],int low,int high)
	{
		int pi = partition(arry, low, high);
		
		if(low < pi-1)
		{
			quickPartition(arry, low, pi-1);
		}
		if(pi < high)
		{
			quickPartition(arry, pi, high);
		}
				
	}
	
	

}
