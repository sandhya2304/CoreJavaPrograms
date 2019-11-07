package wednesday5;

public class ReverseArraySwapping
{
	public static void main(String[] args)
	{
		
		reverseArray(new int[] {12,3,4,5,6,7},0, 5);
		

	}
	public static void reverseArray(int []arry,int start,int end)
	{
		
		int temp;
		
		while(start < end)
		{
			temp = arry[start];
			arry[start] = arry[end];
			arry[end] = temp;
			start++;
			end--;
		}
		
		System.out.println("print arrys:");
		for(int i=0;i<arry.length;i++)
		{
			System.out.print(arry[i]+ " ");
		}
		
		
	}

}
