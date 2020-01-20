package saturday9;

import java.util.Scanner;

public class Pyramid4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows:");
		int rows = sc.nextInt();
		
		int rowcount = 1;
		
		for(int i=rows;i >=0;i--)
		{
			for(int j=1;j <= i*2;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=rowcount;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=rowcount-1;j >= 1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			rowcount++;
		}

	}

}
