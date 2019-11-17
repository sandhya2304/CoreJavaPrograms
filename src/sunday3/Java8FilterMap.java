package sunday3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Java8FilterMap
{
	public static void main(String[] args)
	{
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("abc","Sandhya");
		map.put("klm","mona");
		map.put("zcn","harsh");

		/*
		 * Set<Entry<String,String>> en = map.entrySet(); for(Map.Entry<String,String> e
		 * : en) { System.out.println(e.getKey()+" : "+e.getValue()); }
		 */
		
		map.entrySet().stream().filter(m -> m.getValue().equals("Sandhya")
				                  ||m.getValue().equals("harsh"))
		                         .forEach(mm -> System.out.println(mm));
		
		System.out.println("  by keyysss....");
		
		map.entrySet().stream().filter(mo -> mo.getKey().startsWith("k"))
		       .forEach(k -> System.out.println(k));
		
	}

}
