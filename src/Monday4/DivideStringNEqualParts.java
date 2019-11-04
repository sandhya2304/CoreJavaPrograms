package Monday4;

public class DivideStringNEqualParts
{
	public static void main(String[] args)
	{
		
         divideString("aaaabbbbcccc",3);
	}
	
	public  static void divideString(String word,int n)
	{
		int str_size = word.length();
		int part_size;
		
		
		// Check if string can be divided in 
	    // n equal parts  
		if(str_size %n !=0)
		{
			System.out.println("String size not divde by zero");
			return;
		}
		
		 // Calculate the size of parts to find  
	    // the division points 
		part_size = str_size / n;
		for(int i=0;i<str_size;i++)
		{
			if(i % part_size==0)
			{
				System.out.println();
				System.out.print(word.charAt(i));
			}
		}
		
		
		
	}

}
