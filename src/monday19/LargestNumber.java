package monday19;

public class LargestNumber 
{
	public static void main(String[] args)
	{
		System.out.println(getLessthnN(123,2));

	}
	
	public static int getLessthnN(int number,int digit)
	{
		char c = Integer.toString(digit).charAt(0);
		
		for(int i = number;i > 0;--i)
		{
			if(Integer.toString(i).indexOf(c) == -1)
			{
			    return i;			
			}
		}
		return -1;
	}

}
