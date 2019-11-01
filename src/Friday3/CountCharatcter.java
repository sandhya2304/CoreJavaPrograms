package Friday3;

public class CountCharatcter {

	public static void main(String[] args)
	{
		String s= "sandhya123@";
       countCharacterVowel(s);
	}
	
	public static void countCharacterVowel(String word)
	{
		int vowels = 0, consonant = 0,specialChar =0,digit =0;
		
		for(int i = 0; i <word.length();i++)
		{
			
			char ch = word.charAt(i);
			if((ch >= 'a' && ch <='z')||
				(ch >='A' && ch <= 'Z'))
			{
				ch = Character.toLowerCase(ch);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' ||ch=='u')
				  vowels++;
				else
					consonant++;	
			}else if (ch >=  '0' && ch <= '9')
				digit++;
			else
				specialChar++;
			
		}
		System.out.println("vowels = "+vowels);
		System.out.println("conosnatant =" +consonant);
		System.out.println("special char =" +specialChar);
		System.out.println(" digit =" +digit);
		
		
	}

}
