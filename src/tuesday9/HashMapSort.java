package tuesday9;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSort
{
	public static void main(String[] args)
	{
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("2","sandhya");
		map.put("6", "harsh");
        map.put("1","abc");
		
        for(Map.Entry<String,String> entry:map.entrySet())
        {
        	System.out.println("key"+entry.getKey()+" value "+entry.getValue());
        }
        
        Map<String,String> map2 = new TreeMap<String, String>(map);
        for(Map.Entry<String,String> e1:map2.entrySet())
        {
        	System.out.println("key "+e1.getKey());
        }
        

	}

}
