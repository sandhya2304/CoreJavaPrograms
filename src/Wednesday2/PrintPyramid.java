package Wednesday2;

import java.util.Scanner;

public class PrintPyramid {

	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("How many rows in your pyramid?");
		int NoOfRows = sc.nextInt();
		
		int rowCount = 1;
		
		System.out.println("Here is your pyramid:");
		
		for(int i=NoOfRows; i > 0;i --)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j= 1;j<=rowCount;j++)
			{
				System.out.print(rowCount+" ");
			}
			System.out.println();
			
			rowCount++;
		}
		

	}

}
