package saturday6;

import java.util.Arrays;

public class StringAnnagram
{
	public static void main(String[] args)
	{
		String s1 = "mom";
		String s2 = "mom";
		
		System.out.println(checkAnag(s1, s2));

	}
	
	public static boolean checkAnag(String s,String ss)
	{
		char c1[] = s.toCharArray();
		char c2[] = ss.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
		
		
		
	}
	

}
