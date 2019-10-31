package Thursday3;

import java.util.Scanner;

public class NumberPattern 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no of rows:");
		int noOfRows = sc.nextInt();
		
		System.out.println("here i pattern: ");
		for(int i=1;i <= noOfRows;i++)
		{
			for(int j=1;j <=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
