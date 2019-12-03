package tuesday9;

public class BubbleSort
{
	public static void main(String[] args) 
	{
		int arr[] = {3,6,7,2,9,1,4};
		
		int temp = 0;
		
		for(int i=0;i<arr.length;i++)
		{
		  int flag =0;
		  
		   for(int j=0;j<arr.length-1-i;j++)
		   {
			   if(arr[j] > arr[j+1])
			   {
				   temp = arr[j];
				   arr[j]= arr[j+1];
				   arr[j+1] = temp;
				   
				   flag = 1;
			   }			   
		   }if(flag == 0)
		   {
			   System.out.println("list sorted...");
			   break;
		   }
		
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"");
		}

	}

}
