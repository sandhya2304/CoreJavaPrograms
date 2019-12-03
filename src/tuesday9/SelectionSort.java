package tuesday9;

public class SelectionSort
{
	public static void main(String[] args)
	{
		
		int arry[] = {6,4,2,8,1,3};
		int min,temp = 0;
		
		for(int i=0;i<arry.length;i++)
		{
			min = i;
			
			for(int j =i;j <arry.length;j++)
			{
				if(arry[j] < arry[min]) 
				{
					 min = j;					
				}
			}
			temp = arry[i];
			arry[i] = arry[min];
			arry[min] = temp;
		}
		for(int i=0;i<arry.length;i++)
		{
			System.out.println(arry[i]+" ");
		}
	}

}
