package tuesday8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayDuplicateHashMap 
{
	public static void main(String[] args)
	{
		
		findDuplicate(new int[] {1,1,1,2,2,3});
	 
	}
	
	public static void findDuplicate(int[] arry)
	{
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int elemnt:arry)
		{
			if(map.get(elemnt)==null)
			{
				map.put(elemnt,1);
			}else
			{
				map.put(elemnt,map.get(elemnt)+1);
			}			
		}
		System.out.println(map);
		
		Set<Entry<Integer,Integer>> entrySet =  map.entrySet();
		
        for(Entry<Integer,Integer> entry:entrySet)
        {
			if(entry.getValue() > 1)
			{
				System.out.println("duplicae elemen"+entry.getKey()+" "+"found"+" "+entry.getValue());
			}
		}
		
	}

}
