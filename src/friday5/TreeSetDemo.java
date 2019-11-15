package friday5;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeSetDemo
{
	public static void main(String[] args)
	{
		TreeMap<Integer,String> tm =new TreeMap<Integer, String>();
		tm.put(1,"sandhya");
		tm.put(2,"harsh");
		tm.put(3,"mona");
		
		for(Map.Entry me  : tm.entrySet())
		{
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		
		TreeMap<String,String> tm1 =new TreeMap<String, String>(new sorttree());
		tm1.put("nn","aasandhya");
		tm1.put("aa","ssharsh");
		tm1.put("ll","bbmona");
		
		//tm1.putAll(tm);
		System.out.println(tm1);
		
		if(tm1.containsKey(11))
		{
			System.out.println(tm1.get(11));
		}
	System.out.println(tm1.values());	
	}

}
 class sorttree implements Comparator<String>
{
	public int compare(String a,String b) {
		return a.compareTo(b);
	}

	
	
}
