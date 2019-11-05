package Tuesday5;

public class DuplicateString
{
	
	static final int noOfChars= 256;
	
	public static void main(String[] args) 
	{
		
		dupString("sandhyasharma");
		
	}
	
	 /* Fills count array with frequency of characters */
	public static void fillcharCounts(String str,int[] count)
	{
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
	}
	
	public static void dupString(String str)
	{
		
		// Create an array of size 256 and fill count of every character in it 
		int count[] = new int[noOfChars];
		fillcharCounts(str, count);
		
		for(int i=0;i<noOfChars;i++)
		{
			if(count[i] > 1)
				System.out.printf("%c, count = %d \n",i,count[i]);
		}
		
	}

}
