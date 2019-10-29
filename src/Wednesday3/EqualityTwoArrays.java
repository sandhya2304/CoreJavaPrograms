package Wednesday3;

public class EqualityTwoArrays 
{

	public static void main(String[] args)
	{
		
		int[] arry1 = {1,2,3,4,5};
		int[] arry2 = {1,2,3,4,5};
		
		boolean equalOrNot = true;
		
		if(arry1.length == arry2.length)
		{
			for(int i = 0; i< arry1.length;i++)
			{
				if(arry1[i] != arry2[i])
				{
					equalOrNot = false;
				}
			}
		}else
		{
			equalOrNot = false;
		}if(equalOrNot)
		{
			System.out.println("equal");
		}else {
			System.out.println("not equal...");
		}
		
		

	}

}
