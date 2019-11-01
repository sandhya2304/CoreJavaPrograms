package Friday3;

public class CountCharacter {

	public static void main(String[] args) 
	{
		String word = "sandhya is here";
		int count = 0;
		
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)!= ' ')
			{
				count++;
			}
			
		}
		
		System.out.println(count + " number ");

	}

}
