package tuesday6;

public class FrequencyOfCaharacter
{
	public static void main(String[] args) 
	{
		String str = "hello sandhya";
		char ch = 'a';
		
		int frequency = 0;
		for(int i=0;i<str.length();i++)
		{
			if(ch == str.charAt(i))
			{
				frequency++;
			}
		}
		System.out.println(frequency);

	}

}
