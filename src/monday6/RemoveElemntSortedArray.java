package monday6;

public class RemoveElemntSortedArray 
{
	public static void main(String[] args)
	{
		int a[] = {1,2,5,3,9,8};
		int n = a.length;
		removeElemnts(a, n);

	}
	
	public static void removeElemnts(int[] arr,int n)
	{
		
		 // brr[] is used to store 
	    // the sorted array elements 
		int[] brr = new int[n];
		int l=1;
		
		brr[0] = arr[0];
		for(int i=1;i<n;i++)
		{
			if(brr[l-1] <= arr[i])
			{
				brr[l] = arr[i];
				l++;
			}
		}
		//sortd
		for(int i=0;i<l;i++)
		{
			System.out.print(brr[i]+" ");
		}
	}

}
