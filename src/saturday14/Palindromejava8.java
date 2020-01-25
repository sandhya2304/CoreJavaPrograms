package saturday14;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Palindromejava8
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the input string:");
		String word = sc.nextLine().replaceAll("\\s","").toLowerCase();
		
		boolean isPalindorme = IntStream.range(0,word.length()/2)
				               .noneMatch(i -> word.charAt(i) != word.charAt(word.length()-i-1));

		
		if(isPalindorme)
		{
			System.out.println(word+" palindorme");
		}else
		{
			System.out.println(word+" not palindorme");
		}
		
		
	}

}
