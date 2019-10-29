package Thursday2;

public class ReverseStringWithPreservePos
{

	public static void main(String[] args)
	{
		
		reverseString("sandhya sharma i m here");

	}
	
	public static void reverseString(String inputString)
	{
		 //Converting inputString to char array 'inputStringArray'
		char[] inputStringArry = inputString.toCharArray();
		
		//Defining a new char array 'resultArray' with same size as inputStringArray
		char[] resultArray = new char[inputStringArry.length]; 
		
		//First for loop : 
        //For every space in the 'inputStringArray', 
        //we insert spaces in the 'resultArray' at the corresponding positions 
         
		
		for(int i=0;i < inputStringArry.length;i++)
		{
			if(inputStringArry[i] == ' ')
			{
				resultArray[i] = ' ';
			}			
		}
		
		//Initializing 'j' with length of resultArray
		int j = resultArray.length-1;
		
		 //Second for loop :
        //we copy every non-space character of inputStringArray 
        //from first to last at 'j' position of resultArray
		for(int i=0; i < inputStringArry.length;i++ )
		{
			if(inputStringArry[i] != ' ')
			{
				if(resultArray[j] == ' ')
				{
					j--;
				}
				resultArray[j] = inputStringArry[i];
				j--;
			}
			
		}
		
		System.out.println(inputString+"--->"+String.valueOf(resultArray));
	}
	
	
	

}
