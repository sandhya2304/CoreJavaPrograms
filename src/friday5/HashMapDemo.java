package friday5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(1,"Sandhy");
        hm.put(2,"harsh");
		hm.put(3,"mona");
		
		for(Map.Entry he : hm.entrySet())
		{
			System.out.println(he.getKey()+" : "+he.getValue());
		}
		
		System.out.println(hm.size());
		
		HashMap<Integer,String> hm1 = new HashMap<Integer, String>();
		hm1.put(5,"aaSandhy");
        hm1.put(6,"bbharsh");
		hm1.put(7,"bbmona");
		System.out.println(hm1);
		
		hm1.putAll(hm);
		System.out.println(hm1);
		
		hm.remove(1);
		System.out.println("remove");
		System.out.println(hm);
		
		if(hm.containsKey(2))
		{
			System.out.println(hm.get(2));
		}
		Set keys = hm.keySet();
		System.out.println("set  ..."+keys);
		
		System.out.println(hm1.values());
		
	}

}
