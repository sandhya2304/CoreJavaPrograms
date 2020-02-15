package saturday19;

public class ArrayAscending
{
	public static void main(String[] args) {
		
		int arry[] = {1,7,3,5,2,6};
		int temp = 0;
		
		System.out.println("original ...");
		for(int i=0;i<arry.length;i++)
		{
			System.out.print(arry[i]+" ");
		}
		
		System.out.println("ascending...");
		for(int i=0;i<arry.length;i++)
		{
			for(int j=i+1;j<arry.length;j++)
			{
				if(arry[i] <arry[j])
				{
					temp = arry[i];
					arry[i] = arry[j];
					arry[j] = temp;
				}
			}
		}
		
		System.out.println("asc ...");
		for(int i=0;i<arry.length;i++)
		{
			System.out.print(arry[i]+" ");
		}
	}

}
