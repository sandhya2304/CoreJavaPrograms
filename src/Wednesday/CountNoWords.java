package Wednesday;

import java.util.HashMap;

public class CountNoWords
{

	public static void main(String[] args)
	{
		
		String str = "This is sandhya sharma";
		String[] s = str.split("");
		
		HashMap<String,Integer> map = new HashMap<String, Integer>();
	
		for(int i = 0; i < s.length-1;i++)
		{
			if(map.containsKey(s[i]))
			{
				int count = map.get(s[i]);
				map.put(s[i], count+1);
			}else
			{
				map.put(s[i],1);
			}
		}
	//or this way 	
		for(String sa:s)
		{
			if(map.containsKey(sa))
			{
				//int count = map.get(s[i]);
				map.put(sa,map.get(sa)+1);
			}else
			{
				map.put(sa,1);
			}
		}
		
		
		
		
       System.out.println(map);
	}

}
