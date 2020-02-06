package monday18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SyncArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> al =new ArrayList<String>();
		al.add("abc");
		al.add("cde");
		al.add("fgh");
		al.add("klm");
		
		List<String> syncList = Collections.synchronizedList(al);
		
		synchronized(syncList)
		{
			Iterator<String> it = syncList.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
          
		
	}

}
