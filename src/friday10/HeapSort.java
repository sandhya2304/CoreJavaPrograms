package friday10;

public class HeapSort
{
	public static void main(String[] args)
	{
		int arry[] = {6,1,9,2,4,99,15,11};
		HeapSort hs = new HeapSort();
		hs.sort(arry);
		
		for(int i:arry)
		{
			System.out.println(i+" ");
		}
	}
	
	public void sort(int arry[])
	{
		int length = arry.length;
		
		for(int i = length/2-1;i >= 0;i--)
		{
			heapify(arry,length, i);
		}
		
		for(int i = arry.length-1;i>=0;i--)
		{
			int temp = arry[0];
			arry[0] = arry[i];
			arry[i] = temp;
			
			heapify(arry, i, 0);
		}	
	}
	
	public void heapify(int arry[],int size,int p)
	{
		
		int largest = p ;
		int left = 2 * p+1;
		int right = 2 * p+2;
		
		if(left < size && arry[left] > arry[largest])
		{
			largest = left;				
		}
		if(right < size && arry[right] > arry[largest])
		{
			largest = right;
		}
		if(largest != p)
		{
			int temp = arry[p];
			arry[p] = arry[largest];
			arry[largest] = temp;
			
			heapify(arry, size, temp);
		}
				
	}
	
}
