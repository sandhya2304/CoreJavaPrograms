package friday4;

public class GivenSuffeix {

	public static void main(String[] args)
	{
		String str = "sandhya is here"
                + " sandhya is there"; 
          String suff = "ya"; 
   
   System.out.print(endWith(str, suff)); 

	}
	
	public static int endWith(String str,String suffix)
	{
		int count = 0;
		
		String words[] = str.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			if(words[i].endsWith(suffix))
			{
				count++;
			}
		}
		return count;
		
		
	}

}
