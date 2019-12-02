package tuesday8;

public class FactorialRecursion
{
	public static void main(String[] args) 
	{
	   System.out.println(factorial(5));
	}
	
	public static int factorial(int numb)
	{
		
		if(numb == 0)
		{
			return 1;
		}
		
		return numb * factorial(numb-1);
	}
}
