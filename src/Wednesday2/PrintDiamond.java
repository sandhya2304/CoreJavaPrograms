package Wednesday2;

import java.util.Scanner;

public class PrintDiamond 
{

	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("How many rows in your diamond?");
		int NoOfRows = sc.nextInt();
		
		int midRow = NoOfRows/2;
		
		int row =1;
		
		System.out.println("Here is you diamond:");
		
		
		//printing upper half of diamond
		for(int i = midRow;i>0;i--)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=row;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
			row++;
			
		}
		
		//print lower half of diamond
		
		for(int i = 0;i<=midRow;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j = row;j > 0;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
			
			row--;
		}
		
		
		
		

	}

}
