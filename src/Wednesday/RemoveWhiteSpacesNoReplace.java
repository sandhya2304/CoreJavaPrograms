package Wednesday;

public class RemoveWhiteSpacesNoReplace {

	public static void main(String[] args) 
	{
		
		String words = "sandhya  sharma";
		
		char[] ch =words.toCharArray();
		
		StringBuffer sb =new StringBuffer();
		
		for(int i=0; i < ch.length;i++)
		{
			if((ch[i] != ' ')&& (ch[i] != '\t'))
			{
				sb.append(ch[i]);
			}
		}
		
System.out.println(sb);
	}

}
