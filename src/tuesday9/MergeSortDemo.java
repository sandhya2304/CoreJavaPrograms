package tuesday9;

public class MergeSortDemo 
{
	
	int[] arry;
	int tempMerge[];
	int length;
	
	public static void main(String[] args)
	{
		int a[] = {1,8,5,7,3,9,2};
		MergeSortDemo ms = new MergeSortDemo();
		ms.sort(a);
		
		for(int i:a)
		{
			System.out.println(i+" ");
		}

	}
	
	public void sort(int input[])
	{
		this.arry = input;
		this.length = input.length;
		this.tempMerge = new int[length];
		divideArray(0,length-1);
		
	}
	public void divideArray(int lowerIndex,int higherIndex)
	{
		
		if(lowerIndex < higherIndex)
		{
			int middle = lowerIndex +(higherIndex-lowerIndex)/2;
			divideArray(lowerIndex, middle);
			divideArray(middle+1, higherIndex);
			mergearryy(lowerIndex, middle, higherIndex);
			
		}		
	}
	
	public void mergearryy(int lowerIndex,int middle,int higherIndex)
	{
		for(int i = lowerIndex;i <= higherIndex;i++)
		{
			tempMerge[i] = arry[i];			
		}
		int i = lowerIndex;
		int j = middle+1;
		int k = lowerIndex;
		
		while(i <= middle && j <=higherIndex)
		{
			if(tempMerge[i] <= tempMerge[j])
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
