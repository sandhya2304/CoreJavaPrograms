package tuesday18;

public class ReverseStringWord {

	public static void main(String[] args) {
		reverseString("sandhya sharma");
	}
	
   public static void reverseString(String input)
   {
	   //split given string into words
	   
	   String[] words = input.split(" ");
	   String reverseString = "";
	   
	   for(int i=0;i<words.length;i++)
	   {
		   //taking each word and reverse it
		   String word = words[i];
		   String reverseWord = " ";
		   
		   for(int j=word.length()-1;j>=0;j--)
		   {
			   reverseWord = reverseWord+word.charAt(j);
		   }
		   
		   reverseString = reverseString+reverseWord+" ";
	   }
	   System.out.println(input);
	   System.out.println(reverseString);
	   
   }

}
