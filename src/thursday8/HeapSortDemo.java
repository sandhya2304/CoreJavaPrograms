package thursday8;

public class HeapSortDemo 
{
	public static void main(String[] args)
	{
		int[] arr = {22,11,66,33,9,7};
		
		HeapSortDemo heap = new HeapSortDemo();
		
		heap.sort(arr);
		
		int len = arr.length;
		for(int i:arr)
		{
			System.out.println(i+" "+len);
		}
		
		System.out.println("------------------------------");
		
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	
	public void sort(int[] arr)
	{
		
		int leng = arr.length;
		
		for(int i = leng/2-1;i >=0;i--)//(2 index and 1 index)
		{
			heapify(arr,leng,i);
		}	
		
		//swap the elemnt and heapify again
			for(int i = leng-1;i>=0;i--)//-1 not consider last elemnt coz it is swap
			{
				int temp = arr[0];
				arr[0] = arr[i];
				arr[i] = temp;
				
				heapify(arr,i,0);//0 se start 
			}
				
	}
	//arry store in heap
	void heapify(int ar[],int size,int i)//i parent node index
	{
		
		int largest = i;//largest contains parent node index
		int left = 2*i+1;//(left child node index)
		int right = 2*i+2;//right chld node index
		
		if(left < size && ar[left] > ar[largest])
		{
			largest = left;
		}
		
		if(right < size && ar[right] > ar[largest])
		{
			largest = right;
		}
		
		if(largest != i)
		{
			int temp = ar[i];
			ar[i] = ar[largest];
			ar[largest] = temp;
			
			heapify(ar, size, largest);
		}
		
	}
	

}
