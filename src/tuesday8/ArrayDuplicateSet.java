package tuesday8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicateSet
{
	public static void main(String[] args)
	{
		
		String []words= {"abc","sandhya","sharma","abc"};
		
        List duplicateList = Arrays.asList(words);
        
       // System.out.println(duplicateList);
		Set duplciateSet = new HashSet(duplicateList);
		if(duplicateList.size()!=duplciateSet.size())
		{
			System.out.println("array contain duplciate");
		}
		else
		{
			System.out.println("not ");
		}
		
	}

}
