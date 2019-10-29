package Monday2;

public class AllPairsArray 
{
	public static void main(String[] args)
	{
		findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
	}
	
	public static void findThePairs(int[] inputArry,int number)
	{
		System.out.println("pairs of elemnts whose sum is :"+number+" are ");
		
		for(int i=0;i<inputArry.length;i++)
		{
			for(int j= i+1;j< inputArry.length;j++)
			{
				if(inputArry[i]+inputArry[j]==number)
				{
					System.out.println(inputArry[i]+" "+inputArry[j]+" = "+number);
				}
			}
		}
		
	}

}
