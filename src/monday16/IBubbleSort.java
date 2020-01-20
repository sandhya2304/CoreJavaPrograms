package monday16;

public class IBubbleSort
{
 
	public static void main(String[] args) 
	{
		int arry[] = {6,9,2,5,1,32,10};
		
		int temp = 0;
		
		for(int i=0;i<arry.length;i++)
		{
			int flag = 0;
			
			for(int j=0;j<arry.length-1-i;j++)
			{
				if(arry[j] > arry[j+1])
				{
					temp = arry[j];
					arry[j] = arry[j+1];
					arry[j+1] = temp;
					
					flag = 1;
				}			
			}if(flag == 0)
			{
				System.out.println("sorted...");
				break;
			}			
		}
		for(int i = 0;i<arry.length;i++)
		{
			System.out.println(arry[i]);
		}
		
	}
	

}
