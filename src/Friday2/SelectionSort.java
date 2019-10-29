package Friday2;

public class SelectionSort
{
	public static void main(String[] args)
	{
		
		selectionSort(new int[] {45, 84, 101, 62, 12, 45});    
		
	}

	public static void selectionSort(int[] inputArry)
	{
		
		int temp,pos;
		
		 //finding the position of smallest element between (i+1)th element and last element
		for(int i=0;i<inputArry.length-1;i++)
		{
			pos = i;
			
			for(int j = i+1;j<inputArry.length;j++)
			{
				if(inputArry[j] < inputArry[pos])
				{
					pos = j;
				}
			}
			//Swapping inputArray[i] and inputArray[pos]
			temp = inputArry[i];
			inputArry[i] = inputArry[pos];
			inputArry[pos] = temp;			
		}
		for(int i = 0; i<inputArry.length;i++)
		{
			System.out.print(inputArry[i]+" ");
		}
		
		System.out.println();
	}
	
	
	
	
	
}
