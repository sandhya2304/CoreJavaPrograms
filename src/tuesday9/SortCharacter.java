package tuesday9;

import java.util.Arrays;

public class SortCharacter 
{
	public static void main(String[] args)
	{
		String s = "sandhya";
		
		char[] c = s.toCharArray();
		
		Arrays.sort(c);
		
		String afterSort = new String(c);
		System.out.println(afterSort);

	}

}
