package friday10;

public class MergeSort
{
	int[] arry;
	int[] tempMerge;
	int length;
	
	public static void main(String[] args)
	{
		int arry[] = {5,9,1,4,9,7,2};
		MergeSort ms = new MergeSort();

		ms.sort(arry);
		
		for(int i:arry)
		{
			System.out.println(i+" ");
		}
	}
	
	public void sort(int[] inputArry)
	{
		this.arry = inputArry;
		this.length = inputArry.length;
		this.tempMerge = new int[length];
		
		divideArry(0, length-1);
		
	}
	
	public void divideArry(int lowerIndex,int higherIndex)
	{
		if(lowerIndex < higherIndex)
		{
			int middle = lowerIndex + (higherIndex-lowerIndex)/2;
			divideArry(lowerIndex, middle);
			
			divideArry(middle+1, higherIndex);
			
			mergeArry(lowerIndex, middle, higherIndex);
			
		}
		
	}
	
	public void mergeArry(int lowerIndex,int middle,int higherIndex)
	{
		for(int i = lowerIndex;i <= higherIndex;i++)
		{
			tempMerge[i] = arry[i];
		}
		
		int i = lowerIndex;
		int j = middle+1;
		int k = lowerIndex;		
		
		while(i <= middle && j <= higherIndex)
		{
			if(tempMerge[i] < tempMerge[j])
			{
				arry[k] = tempMerge[i];
				i++;
			}else
			{
				arry[k] = tempMerge[j];
				j++;
			}
			k++;
		}while(i <= middle)
		{
			arry[k] = tempMerge[i];
			k++;
			i++;
		}
		
	}
	
	
	

}
