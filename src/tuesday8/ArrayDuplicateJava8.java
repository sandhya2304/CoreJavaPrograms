package tuesday8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayDuplicateJava8
{
	public static void main(String[] args)
	{
		
		duplicate(new int[] {1,1,1,2});

	}
	
	public static void duplicate(int[] arry)
	{
		Set<Integer> uniqueElements = new HashSet<Integer>();
	
		
		Set<Integer> duplicateElement = Arrays.stream(arry)
				                          .filter(i -> !uniqueElements.add(i))
				                           .boxed()
				                           .collect(Collectors.toSet());
		
		System.out.println(duplicateElement);
		
	}
}
