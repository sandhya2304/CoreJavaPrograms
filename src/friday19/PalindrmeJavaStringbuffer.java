package friday19;

import java.util.Scanner;

public class PalindrmeJavaStringbuffer
{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter th word");
		String word = sc.nextLine().replaceAll("\\s","");
		
		String reverse = new StringBuffer(word).reverse().toString();
		if(word.equalsIgnoreCase(reverse))
		{
			System.out.println("word is palindomre");
		}
		else
		{
			System.out.println("not palindorme");
		}
		
	}
	

}
