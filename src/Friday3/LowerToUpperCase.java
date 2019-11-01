package Friday3;

public class LowerToUpperCase 
{
	public static void main(String[] args)
	{
		String word = "Great Sandhya";
		
		StringBuffer newStr = new StringBuffer(word);
		
		for(int i = 0; i <newStr.length();i++)
		{
			if(Character.isLowerCase(word.charAt(i)))
			{
				newStr.setCharAt(i, Character.toUpperCase(word.charAt(i)));
			}
			else if(Character.isUpperCase(word.charAt(i))) {
				newStr.setCharAt(i, Character.toLowerCase(word.charAt(i)));
			}
		}
		
		System.out.println("string after conversion " +newStr);

	}

}
