package Wednesday3;

public class StringReverse
{
	public static void main(String[] args) 
	{
		String words = "sandhya";
		StringBuffer sb = new StringBuffer(words);
		System.out.println(sb.reverse());
		
		
		String word2 = "sandhya";
		char[] ch =word2.toCharArray();
		
		for(int i = ch.length-1; i >= 0;i--)
		{
			System.out.print(ch[i]);
		}
		
		System.out.println();
		
		String word3 = "harsh";
		System.out.println(recurseString(word3));

	}
	
	
	public static String recurseString(String word)
	{
		if((null == word) || (word.length() <= 1))
		{
			return word;
		}
		return recurseString(word.substring(1))+word.charAt(0);
		
	}

}
