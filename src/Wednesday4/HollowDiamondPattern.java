package Wednesday4;

import java.util.Scanner;

public class HollowDiamondPattern
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter number of rows:");
		int noOfRows = sc.nextInt();
		
		//print upper triangle
		for(int i=1; i <= noOfRows;i++)
		{
			for(int j = noOfRows; j > i;j--)
			{
				System.out.print(" ");
			}
			System.out.print(" * ");
			
			for(int j=1; j <(i-1)*2;j++)
			{
				System.out.print(" ");
			}
			if(i==1)
			{
				System.out.print("\n");//move to nextline
			}else
			{
				System.out.print("*\n");
			}		
		}
		
		//print lower triangle
		for(int i = noOfRows-1;i >=1;i--)
		{
			for(int j=noOfRows;j>i;j--)
			{
				System.out.print(" ");
			}
			System.out.print(" * ");
			
			for(int j=1;j <(i-1)*2;j++)
			{
				System.out.print(" ");
			}
			if(i==1)
			{
				System.out.print("\n");
			}else
			{
				System.out.print("*\n");
			}
			
		}
		
		
		
		
		
		
		

	}

}
