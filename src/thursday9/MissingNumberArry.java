package thursday9;

public class MissingNumberArry
{
	public static void main(String[] args)
	{
		
		int arry[] = {1,2,3,5};
		
		int miss = missing(arry, 5);
        
       System.out.println(miss);
	}
	
	public static int missing(int arr[],int n)
	{
		int actualSize = 0;
		int expectedTotal = (n*(n+1)/2);
		
		for(int i:arr)
		{
			actualSize += i;
		}
		
		return (expectedTotal - actualSize);
	}
	
	

}
