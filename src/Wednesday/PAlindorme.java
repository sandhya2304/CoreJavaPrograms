package Wednesday;

import java.util.Scanner;

public class PAlindorme {

	public static void main(String[] args)
	{
		String reverse ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the original:");
		String Original = sc.nextLine();
		
		int length = Original.length();
		for(int i =length-1; i >=0;i--)
		{
			reverse = reverse+Original.charAt(i);
		}
		
		if(Original.equals(reverse))
		{
			System.out.println("palindrome");
		}else
		{
			System.out.println("not palindrome");
		}
		

	}

}
