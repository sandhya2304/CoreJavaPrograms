package wednesday19;

import java.util.Scanner;

public class Matrix
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows :");
		int rows = sc.nextInt();
		
		System.out.println("Enter no. of columns :");
		int cols = sc.nextInt();
		
		int matrx[][] = new int[rows][cols];
		System.out.println("Enter matrix data :");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrx[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Your matrix is :");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(matrx[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
