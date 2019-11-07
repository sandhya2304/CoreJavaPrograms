package thursday4;

public class SumArry {

	public static void main(String[] args) 
	{
		int arry[] = {1,4,5,6,9};
		int sum = 0;
		
		for(int i=0;i<arry.length;i++)
		{
			sum = sum + arry[i];
		}
		System.out.println("total :"+sum);
		
	}

}
