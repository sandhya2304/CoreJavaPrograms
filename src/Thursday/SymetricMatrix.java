package Thursday;

import java.util.Scanner;

public class SymetricMatrix 
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int rows = sc.nextInt();
		
		System.out.println("Enter the no of columns:");
		int cols = sc.nextInt();
		
		int matrix[][] = new int[rows][cols];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("print the input elements");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(matrix[i][j]+"\t" );
			}
			
			System.out.println();
		}
		
		 //Checking the input matrix for symmetric
		
		if(rows!=cols)
		{
			System.out.println("The given matrix is not square matrix: So it cant be symetric ");
		}
		else
		{
			
			boolean symmetric = true;
			
			for(int i = 0 ;i<rows;i++)
			{
				for(int j=0;j < cols;j++)
				{
					if(matrix[i][j] != matrix[j][i])
					{
						symmetric = false;
						break;
					}
				}
			}
			
			if(symmetric)
			{
				System.out.println("given matrix is sysmmetric");
			}else
			{
				System.out.println("given matrix is unsysmmetric");
			}
				
		}
		
	}

}
