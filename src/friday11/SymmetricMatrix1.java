package friday11;

import java.util.Scanner;

public class SymmetricMatrix1
{
	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the rows:");
		int rows = sc.nextInt();
		
		System.out.println("Enter the columns: ");
		int cols = sc.nextInt();
		
		int matrix[][] = new int[rows][cols];
		
		System.out.println("Enter the elements :");
		
		for(int i =0;i<rows;i++)
		{
			for(int j = 0;j<cols;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Print the input elemenst ....");

		for(int i =0;i<rows;i++)
		{
			for(int j = 0;j<cols;j++)
			{
				System.out.println(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		if(rows != cols)
		{
			System.out.println("the matrxi is not squre matrix");
		}else
		{
			boolean symmetric = true;
			
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
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
				System.out.println("not symmetrix..");
			}
			
		}

	}

}
