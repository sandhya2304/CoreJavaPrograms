package wednesday18;

public class MissingNumberArry
{
	public static void main(String[] args)
	{
        int n = 7;
        int[] a = {1, 4, 5, 3, 7, 8, 6};
		
        int sumofnnumber= sumOfNumbers(n);
        int sumElemts = sumOfElemts(a);
        
        int missingNumber = sumofnnumber - sumElemts;
        System.out.println(missingNumber);
	}
	
	public static int sumOfNumbers(int n)
	{
		int sum = (n*(n+1)/2);
		return sum;
	}
	
	public static int sumOfElemts(int[] arry)
	{
		int sum = 0;
		for(int i=0;i<arry.length;i++)
		{
			sum = sum+arry[i];
		}
		return sum;
	}
}
