package Saturday;

import java.util.Scanner;

public class SaddlePoint
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows");
		int rows = sc.nextInt();
		
		System.out.println("enter the cols");
		int cols = sc.nextInt();
		
		int[][] matrix = new int[rows][cols];
		
		System.out.println("Enter the eleemnets :");
		for(int i = 0;i <rows;i++)
		{
			for(int j = 0 ;j< cols;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
			
		}
		
		
		System.out.println("Print the elements:");
		
		for(int i = 0; i <rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		findSaddlePoint(matrix);
		

	}
	
	
	public static void findSaddlePoint(int[][] matrix)
	{
		
		/*
		 * Step 1 : For each row of the matrix, find the smallest element in a row and 
		 * store it in rowMin and also store its column index in colIndex.
		 * 
		 */
		
		for(int i= 0;i < matrix.length;i++)
		{
			int rowMin = matrix[i][0];
			
			int colIndex = 0;
			
			boolean saddlePoint = true;
			
			//Finding the smallest elemnt in its row
			for(int j = 1; j < matrix[i].length; j++)
			{
				if(matrix[i][j] < rowMin)
				{
					rowMin = matrix[i][j];
					colIndex = j;
				}
				
			}
			

            //Checking rowMin is also the largest element in its column
           
			for(int j = 0; j < matrix.length;j++)
			{
				if(matrix[j][colIndex] > rowMin)
				{
					saddlePoint = false;
					break;
				}
				
			}
			
			if(saddlePoint)
			{
				System.out.println("this is saddle point" +rowMin);
			}else
			{
				System.out.println("no saddle point");
			}
		}
		
		
		
		
		
		
	}
	

}

