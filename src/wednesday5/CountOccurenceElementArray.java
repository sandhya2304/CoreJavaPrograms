package wednesday5;

import java.util.HashMap;

public class CountOccurenceElementArray 
{
	public static void main(String[] args)
	{
		
		countOccurence(new int[] {1,2,2,3,4,4,4,4});
	}
	
	public static void countOccurence(int[] arr)
	{
		HashMap<Integer,Integer> countMap = new HashMap<Integer, Integer>();
		
		for(int i:arr)
		{
			if(countMap.containsKey(i))
			{
				countMap.put(i,countMap.get(i)+1);
			}else
			{
				countMap.put(i,1);
			}	
		}
		System.out.println(countMap);
		
		
		
		
	}
	

}
