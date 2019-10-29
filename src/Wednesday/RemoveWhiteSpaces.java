package Wednesday;

public class RemoveWhiteSpaces {

	public static void main(String[] args)
	{
		
		String str = "sandhya      sharma";
		
		String str2 = str.replaceAll("\\s","");
		System.out.println(str2);
		

	}

}
