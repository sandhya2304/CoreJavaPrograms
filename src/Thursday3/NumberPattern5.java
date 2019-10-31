package Thursday3;

import java.util.Scanner;

public class NumberPattern5 {

	public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows:");
		int noOfRows = sc.nextInt();
		
		System.out.println("here is your pattern:");
		
		//upper half
		for(int i = noOfRows; i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//lower half
		for(int i=2;i<=noOfRows;i++)
		{
			for(int j = 1;j <=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
