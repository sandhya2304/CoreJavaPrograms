package Monday21;


public class ReverseAgain
{
	public static void main(String[] args) 
	{
		
	   String word = "sandhya";	
	   String reverse = "";
	   
	  // int len = word.length();
	   
	   for(int i=word.length()-1;i>0;i--)
	   {
		   reverse = reverse +word.charAt(i);		  
	   }
	   System.out.println(reverse);
	
	}
}
