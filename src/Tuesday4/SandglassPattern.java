package Tuesday4;

import java.util.Scanner;

public class SandglassPattern
{
	public static void main(String[] args)
	{
		
       Scanner sc = new Scanner(System.in);
		
		System.out.println("how many rows :");
		int noOfRows = sc.nextInt();
		
		//upper half
		for(int i=1;i <= noOfRows;i++)
		{
			for(int j=1;j< i;j++)
			{
				System.out.print(" ");
			}
			for(int j = i;j <=noOfRows;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//lower half
		for(int i =noOfRows-1; i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j <=noOfRows;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		

	}

}
