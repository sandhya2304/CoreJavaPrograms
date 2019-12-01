package sunday5;

public class MergeSort
{
	
	int []arr;
	int []tempMerge;
	int length;
	
	public static void main(String[] args)
	{
	     int [] input = {5,1,3,9,5,7,4};
		 MergeSort ms = new MergeSort();
	     ms.sort(input);
	     
	     for(int i:input)
	     {
	    	 System.out.println(i+"  ");
	     }

	}
	public void sort(int inputArr[])
	{
		
		this.arr = inputArr;
		this.length = inputArr.length;
		this.tempMerge = new int[length];
		divideArray(0, length-1);
		
	}
	public void divideArray(int lowerIndex,int higherIndex)
	{
		
		if(lowerIndex < higherIndex)
		{
			int middle = lowerIndex + (higherIndex-lowerIndex)/2;
			
			//sort left side
			divideArray(lowerIndex,middle);
			
			//sort right side
			divideArray(middle+1, higherIndex);
			
			mergeArry(lowerIndex, middle, higherIndex);
		}		
	}
	
	public void mergeArry(int lowerIndex,int middle,int higherIndex)
	{
		for(int i = lowerIndex;i<=higherIndex;i++)
		{
			tempMerge[i] = arr[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		
		while(i <= middle && j <= higherIndex)
		{
			if(tempMerge[i] <= tempMerge[j])
			{
				arr[k] = tempMerge[i];
				i++;
			}else
			{
				arr[k] = tempMerge[j];
				j++;				
			}
			k++;
		}while(i <= middle)
		{
			arr[k] = tempMerge[i];
			k++;
			i++;
		}
		
	}
	
	
	

}
