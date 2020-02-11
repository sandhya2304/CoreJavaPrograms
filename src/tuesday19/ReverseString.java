package tuesday19;

public class ReverseString 
{
	public static void main(String[] args)
	{
		reverseString("sandhya sharma");
	}
	
	public static void reverseString(String input)
	{
		String[] words = input.split(" ");
        String reverse  = " ";
        
        for(int i=0;i<words.length;i++)
        {
        	String word = words[i];
        	String reverseWord = " ";
        	
        	for(int j=word.length()-1;j>=0;j--)
        	{
        		reverseWord = reverseWord+word.charAt(j);
        	}
        	reverse = reverse+reverseWord+" ";
        }
		System.out.println(input);
		System.out.println(reverse);
	}

}
