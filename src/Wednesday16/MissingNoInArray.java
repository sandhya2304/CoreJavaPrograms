package Wednesday16;

public class MissingNoInArray 
{

	public static void main(String[] args) 
	{
		int n = 9;
		int[] numb = {1, 4, 5, 3, 7, 8, 6,5};
		
		int sumOfNumb = sumOfNumber(n);
		
		int sumOfElement = sumOfElements(numb);
		int missingNumber= sumOfNumb - sumOfElement;
		
		System.out.println("missing----"+missingNumber);

	}
	
	public static int sumOfNumber(int n)
	{
		int sum = (n*(n+1))/2;
		
		return sum;
	}
	
	
	public static int sumOfElements(int[] arry)
	{
		int sum = 0;
		for(int i=0;i<arry.length;i++)
		{
			sum = sum+arry[i];
		}
		return sum;
		
	}
	

}
