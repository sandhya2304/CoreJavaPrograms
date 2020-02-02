package sunday17;

public class ReverseString
{
	public static void main(String[] args)
	{
		String naam = "sandhya";
		reverse(naam);
	}
	
	public static String reverse(String word)
	{
		char []ch = word.toCharArray();
		
		for(int i=word.length()-1; i >=0;i--)
		{
			System.out.println(ch[i]);
		}
		return word;
		
	}

}
