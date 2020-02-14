package friday19;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PalindrmeJAva8 
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the word: ");
		String word = sc.nextLine().replaceAll("\\s","").toLowerCase();
		
		boolean prime = IntStream.range(0,word.length()/2)
				      .noneMatch(i -> word.charAt(i) != word.charAt(word.length()-1-i));
		
	   if(prime)
	   {
		   System.out.println("yes palindorme");
	   }else
	   {
		   System.out.println("not");
	   }
		
	}
	

}
