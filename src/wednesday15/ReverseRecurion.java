package wednesday15;

public class ReverseRecurion {

	public static void main(String[] args)
	{
		String words = "sandhya sharma";
		String rev = reverse(words);
		System.out.println(rev);
	}
	
	public static String reverse(String sentence)
	{
		if(sentence.isEmpty())
		
			return sentence;
		
		return reverse(sentence.substring(1))+sentence.charAt(0);
	}
}
