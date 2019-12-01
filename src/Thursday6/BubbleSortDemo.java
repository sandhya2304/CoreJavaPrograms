package Thursday6;

public class BubbleSortDemo
{
	public static void main(String[] args) 
	{
		int arr[]  = {6,3,7,1,9,2};
		
		int temp =0;
			
		for(int i =0; i < arr.length;i++)
		{
			int flag = 0;
		
			//-i coz if sorted then not go towards last element after that second last also
			for(int j=0; j <arr.length-1-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
				}	
				//agr falg 0 hai to number 0 hai
			}if(flag == 0)
			{
				System.out.println("array sorted...");
				break;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}

	}

}
