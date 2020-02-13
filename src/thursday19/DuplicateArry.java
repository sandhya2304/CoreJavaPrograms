package thursday19;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateArry
{
	public static void main(String[] args)
	{
		findDupUsingHashMap(new int[] {1,1,2,3,5});
	}
	
	public static void findDupUsingHashMap(int[] input)
	{
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int numb:input)
		{
			if(map.get(numb) == null)
			{
				map.put(numb,1);
			}else
			{
				map.put(numb,map.get(numb)+1);
			}
		}
		Set<Entry<Integer,Integer>> entry = map.entrySet();
		
		for(Entry<Integer,Integer> ee:entry)
		{
			if(ee.getValue() > 1)
			{
				System.out.println("dup "+ee.getKey()+" found :"+ee.getValue());
			}
		}
		
	}

}
