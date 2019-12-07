package saturday6;

public class RevrseString 
{
	public static void main(String[] args)
	{
		String words = "sandhya";
		
		String revrse = "";
		
		for(int i = words.length()-1;i >=0;i--)
		{
			revrse = revrse+words.charAt(i);
		}
		
		System.out.println(revrse);
		

	}

}
