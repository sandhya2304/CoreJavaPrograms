package Saturday;

import java.util.Arrays;
import java.util.HashSet;

public class UnionArrayUsingHashSet
{

	public static void main(String[] args) 
	{
	   int input[] = {1,3,45,6,8,9,22};
		int input1[] = {5,6,7,8,9,0,1}; 

		union(input,input1);
	}
	
	
	public static void union(int[]... inputArrys)
	{
		HashSet<Integer> unionSet = new HashSet<Integer>();
		
		System.out.println("---input arrays----");
		for(int[] inputArry:inputArrys)
		{
			//printing both arrays
			System.out.println(Arrays.toString(inputArry));
			for(int i:inputArry)
			{
				unionSet.add(i);
			}
		}
		
		System.out.println(unionSet);
	}
	

}
