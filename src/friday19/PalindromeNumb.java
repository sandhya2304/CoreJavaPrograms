package friday19;

import java.util.Scanner;

public class PalindromeNumb 
{
	
	public static void main(String[] args) 
	{
		
         String word , rev = "";
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter th word");
         word = sc.nextLine();
         
         int len = word.length()-1;
         
         for(int i = len;i >=0;i--)
         {
        	 rev = rev+word.charAt(i);
         }
         
         if(word.equals(rev))
         {
        	 System.out.println("palindorme");
         }else
         {
        	 System.out.println("not palindomre");
         }
		
	}
	

}
