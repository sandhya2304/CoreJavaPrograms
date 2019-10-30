package Wednesday4;

import java.util.Scanner;

public class HalfDiamond {

	public static void main(String[] args)
	{
		
		 Scanner sc = new Scanner(System.in);
			
		 System.out.println("how many rows :");
		 int noOfRows = sc.nextInt();
			
			
		System.out.print("Enter symbol");
		char c = sc.next().charAt(0);
		//upper half
		for(int i=1; i <=noOfRows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
		//lower half
		for(int i =noOfRows-1;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
			}
			System.out.println();
		}

	}

}
