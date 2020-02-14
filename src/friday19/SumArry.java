package friday19;

public class SumArry
{
	
	public static void main(String[] args) {
		
		int arry[] = {1,2,3,4,5};
		int sum = 0;
		
		for(int i=0;i < arry.length;i++)
		{
			sum = sum+arry[i];
		}
		System.out.println(sum);
	}

}
