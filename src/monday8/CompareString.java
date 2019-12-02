package monday8;

public class CompareString 
{
	public static void main(String[] args) 
	{
		String s1 = "sandhya";
		String s2 = "andhya";
		
		boolean isCompare = false;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i) != s2.charAt(i))
			{
				isCompare = false;
				break;
			}
			
			isCompare = true;
		}
		
		System.out.println(isCompare);
	}

}
