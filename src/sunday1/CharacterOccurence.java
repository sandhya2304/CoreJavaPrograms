package sunday1;

public class CharacterOccurence
{
	public static void main(String[] args)
	{
		
		String s = "sandhyasharma";
		char c = 's';
        System.out.println(count(s, c)); 
	}
	
	public static long count(String s,char ch)
	{
		
		return s.chars()
				 .filter(c -> c ==ch )
				 .count();
	}
}
