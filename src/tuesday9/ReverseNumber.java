package tuesday9;

public class ReverseNumber
{
	public static void main(String[] args)
	{
 
		Integer numb = 123;
		String word = String.valueOf(numb);
          
		String reverse = "";
		
		for(int i=word.length()-1;i>=0;i--)
		{
			reverse = reverse+word.charAt(i);
		}
         System.out.println(Integer.valueOf(reverse));
	}

}
