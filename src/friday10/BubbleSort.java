package friday10;

public class BubbleSort
{
	public static void main(String[] args)
	{
		int arry[] = {5,2,9,3,6,11,25,11};
		
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
					 
					 flag=1;
				 }			 
			 }if(flag == 0)
				{
					System.out.println("sorted....");
					break;
				}
		}
		
		for(int i=0;i<arry.length;i++)
		{
			System.out.println(arry[i]+" ");
		}
		

	}

}
