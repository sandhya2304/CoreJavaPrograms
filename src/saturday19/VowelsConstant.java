package saturday19;

public class VowelsConstant
{
	public static void main(String[] args)
	{
		String word = "sandhya";
		int vcount = 0;
		int constant = 0;
		
		word = word.toLowerCase();
		
		for(int i =0;i<word.length();i++)
		{
			if(word.charAt(i) =='a' || word.charAt(i) =='e' || word.charAt(i) =='i'
					|| word.charAt(i) == 'o' || word.charAt(i) == 'u')
			{
				vcount++;
			}else
				if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
				{
					constant++;
				}
		}
		System.out.println(vcount+" = "+constant);

	}

}
