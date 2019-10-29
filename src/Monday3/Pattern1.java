package Monday3;

import java.util.Scanner;

public class Pattern1
{
	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("how many rows");
		int noOfRows = sc.nextInt();
		
		int rowCount = 1;
		
		System.out.println("pyramid -----");
		
		
		for(int i = noOfRows; i > 0 ;i--)//i > 0 otherwise not print number
		{
			////Printing i spaces at the beginning of each row
			for(int j = 1; j <= i;j++)//left side part straight
			{
				System.out.print(" ");
			}
			
			////Printing 'rowCount' value 'rowCount' times at the end of each row
			 
			for(int j = 1; j <= rowCount ;j++)//below to top number print
			{
				System.out.print(rowCount+" ");
			}
			System.out.println();
			
			rowCount++;
		}

	}

}
