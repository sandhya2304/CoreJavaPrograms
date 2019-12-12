package thursday9;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray
{
	public static void main(String[] args)
	{
		
		String arry[]  = {"sandhya","harsh","sandhya","mona"};
		
		Set NonDuplicate = new HashSet();
		Set Duplicate = new HashSet();
		
		for(String s: arry )
		{
			if(!NonDuplicate.contains(s))
			{
				NonDuplicate.add(s);
			}else
			{
				Duplicate.add(s);
			}
		}
		
		System.out.println(Duplicate);

	}

}
