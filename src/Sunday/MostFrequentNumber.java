package Sunday;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MostFrequentNumber
{

	public static void main(String[] args)
	{
		
		mostFrequent(new int[] {1});
		
	//	mostFrequent(new int[] {1,1,1,1,1,5,6,6,6});
		
	}
	
	public static void mostFrequent(int inputArry[])
	{
		HashMap<Integer,Integer> countMap = new HashMap<Integer, Integer>();
		for(int arr :inputArry)
		{
			if(countMap.containsKey(arr))
			{
				countMap.put(arr,countMap.get(arr)+1);
			}else
			{
				countMap.put(arr,1);
			}
		}
		
		System.out.println("y--itertaing frequncies---"+countMap);
		
		int element = 0;
		int frequency = 1;
		
		 //Iterating through elementCountMap to get the most frequent element and its frequency
		Set<Entry<Integer,Integer>> entrySet = countMap.entrySet();
		for(Entry<Integer,Integer> entry :entrySet)
		{
			if(entry.getValue() > frequency)
			{
				element = entry.getKey();
				frequency = entry.getValue();
			}
		}
		
		if(frequency >  1)
		{
			System.out.println("input array :"+Arrays.toString(inputArry));
			System.out.println("the most frequent elemnt :"+element);
			System.out.println("Its frequency :"+frequency);
			
		}else
		{
			System.out.println("input array :"+Arrays.toString(inputArry));
			System.out.println("All elemnts are unique: ");
		}
		
		
	}
	
	

}
