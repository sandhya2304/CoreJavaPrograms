package sunday5;

public class RecursionDemo 
{
	public static void main(String[] args)
	{
		int val = 1; 
		print(val);

	}

	public static void print(int v)
	{
		System.out.println(v);
		v++;
		
		if(v <= 10)
		{
			print(v);
		}
	}
	
}
