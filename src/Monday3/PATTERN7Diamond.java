package Monday3;

import java.util.Scanner;

public class PATTERN7Diamond 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of rows:");
		int NoOfRows = sc.nextInt();
		
		int midRow = (NoOfRows)/2;
		
		int row = 1;
		
		System.out.println("---Pyramid---");
		
		   //Printing upper half of the diamond
		for(int i = midRow; i > 0; i--)
		{
			for(int j = 1; j <= i;j++)
			{
				System.out.print("  ");
			}
			
			for(int j=1; j <=row;j++ )
			{
				System.out.print(" * ");
			}
			
			System.out.println();
			row++;
		}
		//PRinting half of the row
		
		for(int i = 0 ; i <= midRow ;i++)
		{
			
			for(int j = 1; j <=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j = row; j >0;j--)
			{
				System.out.print(" * ");
			}
			System.out.println();
			row--;
		}
		
		
		

	}

}
