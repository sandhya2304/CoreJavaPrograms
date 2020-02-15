package saturday19;

public class OddEven
{
	public static void main(String[] args) {
		
		int arry[] = {1,2,3,5,6,7,9};
		
		System.out.println("odd");
		for(int i=0;i<arry.length;i++)
		{
			if(arry[i]%2 !=0)
			{
				System.out.println(" odd "+arry[i]);
			}
			
		}
		
		
		System.out.println("even");
		for(int i=0;i<arry.length;i++)
		{
			if(arry[i]%2 ==0)
			{
				System.out.println(" even "+arry[i]);
			}
			
		}
	}

}
