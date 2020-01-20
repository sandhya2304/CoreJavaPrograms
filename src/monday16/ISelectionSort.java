package monday16;

public class ISelectionSort
{
	public static void main(String[] args)
	{
		int arry[] = {6,9,3,5,2,1};
		
		int min,temp = 0;
		
		for(int i=0;i<arry.length;i++)
		{
			min = i;
			
			for(int j=i;j<arry.length;j++)
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
			System.out.println(arry[i]);
		}
	}

}
