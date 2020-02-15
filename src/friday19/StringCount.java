package friday19;

public class StringCount
{
	public static void main(String[] args)
	{
		
		String word = "sandhya shamra";
		int count = 0;
		
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i) != ' ')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
