package Tuesday5;

import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args) 
	{
		String str , rev ="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string....");
		str= sc.nextLine();
		
		int len = str.length()-1;
		
		for(int i =len; i >=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println("palindrome");
		}else
		{
			System.out.println("not plaindrome...");
		}

	}

}
