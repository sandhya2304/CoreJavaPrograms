package saturday7;

public class HeapSort
{
	public static void main(String[] args)
	{
		
		int arr[] = {6,4,9,2,5,1,99,33};
		HeapSort hs = new HeapSort();
		hs.sort(arr);
		
		for(int i:arr)
		{
			System.out.println(i);
		}
	
	}
	public void sort(int arr[])
	{
		int leng = arr.length;
		
		for(int i =leng/2-1;i>=0;i--)
		{
			heapify(arr, leng,i);
		}
		
		//swap
		for(int i=leng-1;i >= 0; i--)
		{
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			
			heapify(arr, i,0);
		}
		
		
	}
	public void heapify(int arr[],int size,int p)
	{
		int largest = p ;
		int left = 2 *p+1;
		int right = 2 *p+2;
		
		if(left < size && arr[left] > arr[largest])
		{
			largest =left;
		}
		if(right < size && arr[right] > arr[largest])
		{
			largest = right;
		}
		if(largest != p)
		{
			int temp = arr[p];
			arr[p] = arr[largest];
			arr[largest] = temp;	
			
			heapify(arr,size,largest);
		}	
		
	}
	
	
	
	

}
