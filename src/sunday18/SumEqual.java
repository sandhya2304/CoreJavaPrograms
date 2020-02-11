package sunday18;

public class SumEqual 
{
	public static void main(String[] args)
	{
		findPAirs(new int[] {5,5,10,7,3,1,16}, 10);
	}
	
	public static void findPAirs(int arrry[],int input)
	{
		System.out.println("pair of elemnt whose sum is "+input);
		for(int i=0;i < arrry.length;i++)
		{
			for(int j=i+1;j<arrry.length;j++)
			{
				if(arrry[i]+arrry[j] == input)
				{
					System.out.println(arrry[i]+ " "+arrry[j]+" = "+ input);
				}
			}
		}
		
	}

}
