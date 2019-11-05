package Tuesday5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args)
	{
		
		String text = "sandhya sandhya sharma";
		
		////Split the string into words using built-in function    
		List<String> list = Arrays.asList(text.split(" "));
		
		Set<String> unique = new HashSet<String>(list);
		for(String w:unique)
		{
			System.out.println(w+" : "+Collections.frequency(list,w));
		}
		
	}

}
