package Wednesday;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIteration {

	public static void main(String[] args)
	{
		
		HashMap<Integer,String> map = new HashMap<Integer, String>();
		map.put(1,"sandhya");
		map.put(2,"sharma");
		
		System.out.println(map.size());
		
		System.out.println("while Loop :");
		Iterator itr = map.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry me = (Entry) itr.next();
			System.out.println("key is:"+me.getKey()+"value is:"+me.getValue());
		}
		
		
		System.out.println("For Loop:");
		for(Map.Entry me2:map.entrySet())
		{
			System.out.println(me2.getKey()+" : "+me2.getValue());
		}
		

	}

}
