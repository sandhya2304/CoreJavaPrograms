package tuesday9;

public class SwapNoTemp
{
	public static void main(String[] args) 
	{
		int a =10;
		int b = 30;
		
		System.out.println("a ="+a+" before swap"+" b = "+b);
         swap(a, b);
        
		
	}
	
	public static void swap(int a,int b)
	{
		a = a+b;
		b = a-b;
		a = a-b;
		
		 System.out.println("a ="+a+" after swap"+" b = "+b);
	}

}
