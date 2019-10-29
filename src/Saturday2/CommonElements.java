package Saturday2;

import java.util.HashSet;

public class CommonElements {

	public static void main(String[] args) 
	{
	    	
		String[] s1 = {"One","Two","One","Three","Four"};
		String[] s2 = {"Five","Six","One","Three","Four"};
		
		
		HashSet<String> set = new HashSet<String>();
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j< s2.length;j++)
			{
				if(s1[i].equals(s2[j]))
				{
					set.add(s1[i]);
				}
			}
		}
          System.out.println(set);

	}

}
