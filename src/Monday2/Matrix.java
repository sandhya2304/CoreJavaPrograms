package Monday2;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows= sc.nextInt();
		
		System.out.println("Enter the columns:");
		int cols= sc.nextInt();
		
		//defining 2D array to hold matrix data
		int[][] matrix2 = new int[rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j < cols;j++)
			{
				 matrix2[i][j] = sc.nextInt();
			}
		}
		System.out.println("your matrxi is :");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j < cols;j++)
			{
				
				System.out.print(matrix2[i][j]+" ");
			}
		System.out.println();
		
	}
}


}