package wednesday7;

public class LinearSearchDemo 
{
	public static void main(String[] args)
	{
		
		int arr[] = {1,6,7,3,4,5};
		
		int item = 17;
		int temp = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == item)
			{
				System.out.println("number is present"+item+" posotion "+i);
			    temp = temp+1;//temp value will not increase if number not found
			}
		}
		if(temp == 0)
		{
			System.out.println("item not found"+item);
		}
		
		

	}

}
