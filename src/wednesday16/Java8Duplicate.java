package wednesday16;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8Duplicate
{
	public static void main(String[] args)
	{
				duplicate(new int[] {11,2,11,2,4});
		
	}
	
	public static void duplicate(int[] word)
	{
		Set<Integer> uniqueElement = new HashSet<>();
		Set<Integer> duplicateElement = Arrays.stream(word)
				       .filter(m -> !uniqueElement.add(m))
				       .boxed()
				       .collect(Collectors.toSet());
		
		System.out.println(duplicateElement);
	}
}
