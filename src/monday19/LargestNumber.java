package monday19;

public class LargestNumber 
{
	public static void main(String[] args)
	{
		System.out.println(getLessthnN(123,1));

	}
	
	public static int getLessthnN(int number,int digit)
	{
		//convert the given number to string ( Integer.toString(i) ) 
		//and given digit to character ( char c = Integer.toString(digit).charAt(0) )
		
		//Converting digit to char
		char c = Integer.toString(digit).charAt(0);
		
		//Decrementing number & checking whether it contains digit
		for(int i = number;i > 0;--i)
		{
			// check whether that string contains the character ‘c’ 
			//or not ( Integer.toString(i).indexOf(c) ).
			
			if(Integer.toString(i).indexOf(c) == -1)
			{
				//If 'i' doesn't contain 'c'
			    return i;			
			}
		}
		return -1;
	}
// We will continue this until we get the number which does not contain a given digit.
}
