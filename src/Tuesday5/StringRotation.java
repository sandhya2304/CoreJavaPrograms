package Tuesday5;

public class StringRotation 
{
	public static void main(String[] args)
	{
		String s1 = "mom";
		String s2 = "mobbm";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("no rotation..");
		}else
		{
			//Concatenate str1 with str1 and store it in str1    
			s1 = s1.concat(s1);
			
			 //Check whether str2 is present in str1    
			if(s1.indexOf(s2)!=-1)
			{
				System.out.println("second string is rotaion first string");
			}else
			{
				System.out.println("not rotation of string s1");
			}
			
			
		}
		

	}

}
