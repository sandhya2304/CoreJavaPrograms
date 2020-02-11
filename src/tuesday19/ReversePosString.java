package tuesday19;

public class ReversePosString
{
	public static void main(String[] args) 
	{
       reverseString("sandhya of is");
	}
	
	public static void reverseString(String input)
	{
		char[] inputString = input.toCharArray();
		char[] resultArry = new char[inputString.length];
		
		for(int i=0;i<inputString.length;i++)
		{
			if(inputString[i] == ' ')
			{
				resultArry[i] = ' ';
			}			
		}
		
		int j = resultArry.length-1;
		for(int i=0;i<inputString.length;i++)
		{
			if(inputString[i] != ' ')
			{
				if(resultArry[j] == ' ')
				{
					j--;
				}
				resultArry[j] = inputString[i];
				j--;
			}		
		}
		System.out.println("input string "+String.valueOf(inputString)+"  -->"+String.valueOf(resultArry));
		
	}
	

}
