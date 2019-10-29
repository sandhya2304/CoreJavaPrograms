package Wednesday3;

import java.util.Arrays;

public class AnagramDemo 
{

	public static void main(String[] args)
	{
		
          isAnagram("mom","Mom");
	}

	
	public static void isAnagram(String s1,String s2)
	{
		
		//Removing all white spaces from s1 and s2
		String copyOfs1 = s1.replaceAll("//s","");
		String copyOfs2 = s2.replaceAll("//s","");
		
		  //Initially setting status as true
		boolean status = true;
		
		if(copyOfs1.length()!= copyOfs2.length())
		{
			status = false;			
		}else
		{
			
			//Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array
			 char[] s1Arry = copyOfs1.toLowerCase().toCharArray();
			 char[] s2Arry = copyOfs2.toLowerCase().toCharArray();
			 
			  //Sorting both s1Array and s2Array
			 Arrays.sort(s1Arry);
			Arrays.sort(s2Arry);
			
			 //Checking whether s1Array and s2Array are equal
			 
			status = Arrays.equals(s1Arry, s2Arry);
		}
		if(status)
		{
			System.out.println(s1+" and "+s2+ " ara nagrams");
		}else
		{
			System.out.println(s1+" and "+s2+ " are not a  anagrams");
		}
		
		
	}
	
	
	
}
