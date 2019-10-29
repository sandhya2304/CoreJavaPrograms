package Friday2;

public class Utility
{
	
	public static boolean numberOrNot(String numb)
	{
		
		
		//f ‘input‘ is a number then this method will return true. If ‘input‘
		//is not a number then NumberFormatException will be raised 
		try
		{
			
		//Try to parse this string to double value by using parseDouble() method 
			//of Double class.
			Double.parseDouble(numb);
		}catch(NumberFormatException ne)
		{
			return false;
		}
		return true;
	}
	

}
