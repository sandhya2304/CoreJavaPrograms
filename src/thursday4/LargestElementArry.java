package thursday4;

public class LargestElementArry 
{
	public static void main(String[] args)
	{
		int arry[] = {1,4,5,6,9};
		
		int max = arry[0];
		
		for(int i=0;i<arry.length;i++)
		{
			if(arry[i] > max)
				max = arry[i];
		}
    System.out.println("max :"+max);
	}

}
