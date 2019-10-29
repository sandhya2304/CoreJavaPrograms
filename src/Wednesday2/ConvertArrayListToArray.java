package Wednesday2;

import java.util.ArrayList;

public class ConvertArrayListToArray {

	public static void main(String[] args)
	{
		
		ArrayList<String> al= new ArrayList<>();
		al.add("peanut");
		al.add("banana");
		al.add("apple");	
		al.add("grapes");
		
		System.out.println(al);
		
		System.out.println("particular index"+al.get(3));
		
		System.out.println("change "+al.set(3, "hello"));
		
		Object[] arr = al.toArray();
		
		for(Object o :arr)
		{
			System.out.println(o);
		}
		

	}

}
