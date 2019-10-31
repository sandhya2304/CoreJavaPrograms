package Thursday3;

import java.util.Scanner;

public class NumberPattern4 {

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows:");
		int noOfRows = sc.nextInt();
		
		System.out.println("here is your pattern:");
		
		
		for(int i=noOfRows;i >=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
