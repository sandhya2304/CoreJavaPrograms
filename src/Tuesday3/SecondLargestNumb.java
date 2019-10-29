package Tuesday3;

public class SecondLargestNumb 
{

	public static void main(String[] args) 
	{
		 System.out.print(secondLarge(new int[] {45, 51, 28, 75, 49, 42}));
		 

	}
	
	public static int secondLarge(int[] inputArry)
	{
		int firstLargest,SecondLargest;
		
		
		//First, we compare the first two elements of the given array.
		 //Checking first two elements of input array
		if(inputArry[0] > inputArry[1])
		{
			 //If first element is greater than second element
			firstLargest = inputArry[0];
			SecondLargest = inputArry[1];
	}
		else
		{
			
			 //If second element is greater than first element
			firstLargest = inputArry[1];
			SecondLargest = inputArry[0];	
		}
		//Checking remaining elements of input array
		
		//We iterate the remaining elements through for loop. 
		for(int i = 1; i<inputArry.length;i++)
		{
			
		//If any element of the remaining elements is greater than the ‘firstLargest‘,
			if(inputArry[i] > firstLargest)
			{
				// then we assign that element to ‘firstLargest‘ and current value of ‘firstLargest‘ will be assigned to ‘secondLargest‘.
				//If element at 'i' is greater than 'firstLargest'
				SecondLargest = firstLargest;
				firstLargest = inputArry[i];
				
			}
			//If any element is smaller than ‘firstLargest‘ and greater than ‘secondLargest‘, then we assign that element to ‘secondLargest‘.
			else if(inputArry[i] < firstLargest && inputArry[i] > SecondLargest)
			{
				SecondLargest = inputArry[i];
			}
			
		}
		return SecondLargest;
		
		
		
		
	}

}
