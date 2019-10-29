package Monday;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows:");
		int rows = sc.nextInt();
		
		int value = 1;
		
		System.out.println("Floyd traingle:");
		for(int i = 1; i <=rows;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print(value+"\t");
				value++;
			}
			System.out.println();
		}
		

	}

}
