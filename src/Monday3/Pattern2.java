package Monday3;

import java.util.Scanner;

public class Pattern2
{
	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("no of rows");
		int noOfRows = sc.nextInt();
		
		int rowCount = 1;
		
		
		for(int i= noOfRows ; i > 0;i--) //outer loop for number of rows
		{
			for(int j =1; j <= i;j++)//inner loop for number of columns
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<= rowCount;j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();  //ending line after each row
			rowCount++;
			
		}
		

	}

}
