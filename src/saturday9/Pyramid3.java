package saturday9;

import java.util.Scanner;

public class Pyramid3 
{
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows:");
		int rows = sc.nextInt();
		
		int rowCount = 1;
		
		for(int i=rows;i >=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=rowCount;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
			rowCount++;
		}
		

	}

}
