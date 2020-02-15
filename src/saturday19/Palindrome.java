package saturday19;

public class Palindrome 
{
	public static void main(String[] args) {
		
		String word = "kayak";
		
		boolean b = true;
		
		word = word.toLowerCase();
		
		for(int i=0;i<word.length()/2;i++)
		{
			if(word.charAt(i) != word.charAt(word.length()-i-1))
			{
				b = false;
				break;
			}
		}
		if(b)
		{
			System.out.println("palindorme");
		}else
		{
			System.out.println("not palindorme");
		}
		
		
	}
	

}
