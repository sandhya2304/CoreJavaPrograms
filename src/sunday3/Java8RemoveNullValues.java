package sunday3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8RemoveNullValues 
{
	public static void main(String[] args)
	{
		
		List<String> ll = Arrays.asList("sandhya","harsh",null,"mona","love");
		
		List<String> lm =ll.stream().filter(w -> w != null)
				          .collect(Collectors.toList());
		
         System.out.println(lm);
	}

}
