package sunday17;

public class EachWordReverse
{
	public static void main(String[] args)
	{
		 String word = "sandy";
		 reverse(word);
         
	}
	
	public static String reverse(String input)
	{
		
		char []ch = input.toCharArray();
		for(int i = input.length()-1;i >=0 ;i--)
		{
			System.out.print(ch[i]);
		}
		return input;
		
	}

}
