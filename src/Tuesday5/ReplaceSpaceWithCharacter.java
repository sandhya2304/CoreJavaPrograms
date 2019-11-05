package Tuesday5;

public class ReplaceSpaceWithCharacter
{
	public static void main(String[] args)
	{
		String s = "Once in a blue moon";
		char ch = '-';
		
		s = s.replace(' ',ch);
		System.out.println("after replcaing...");
		System.out.println(s);

	}

}
