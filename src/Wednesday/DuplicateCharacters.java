package Wednesday;

public class DuplicateCharacters {

	public static void main(String[] args)
	{
		
		String words = "sandhya";
		char[] ch =words.toCharArray();
		
		int count = 0;
		
		System.out.println("Duplicate characters are:");
		for(int i=0;i<words.length();i++)
		{
			 for(int j = i+1;j<words.length();j++)
			 {
				 if(ch[i] == ch[j])
				 {
					 System.out.println(ch[j]);
					 count++;
					 break;
				 }
			 }
		}
		
		

	}

}
