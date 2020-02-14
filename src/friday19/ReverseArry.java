package friday19;


public class ReverseArry
{
	public static void main(String[] args) {
		
		int arry[] = {1,4,56,7,8,9};
		
		for(int i =0;i<arry.length;i++)
		{
			System.out.println(arry[i]+" ");
		}
		
		System.out.println("reverse.....");
		
		for(int i =arry.length-1;i>=0;i--)
		{
			System.out.println(arry[i]+" ");
		}
		
		
	}
	

}
