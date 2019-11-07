package thursday4;

public class EvenPositionOdd
{
	public static void main(String[] args) 
	{
		
		int[] arry = {11,12,13,4,5,6,7};
		
		for(int i = 0;i <arry.length;i = i+2)
		{
			System.out.print(arry[i]+" ");
		}
		
		
		System.out.println("odd");
		for(int i = 1;i <arry.length;i = i+2)
		{
			System.out.print(arry[i]+" ");
		}
		

	}

}
