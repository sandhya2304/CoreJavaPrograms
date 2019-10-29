package Saturday;

import java.util.Scanner;

public class HarshadNivenNo {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of :");
		int numb = sc.nextInt();
		checkNiven(numb);
		
	}
	
	public static void checkNiven(int inputNo)
	{
		int copyInputNo = inputNo;
		
		int sum = 0;
		int lastdigit = 0;
		
		while(inputNo!=0)
		{
			lastdigit = inputNo %10;
			sum =sum +lastdigit;
			inputNo = inputNo / 10;
		}
		
		
		//check input no is divisible by 0
		if((copyInputNo % sum) == 0)
		{
			System.out.println(copyInputNo + "niven no");
		}
		else
		{
			System.out.println(copyInputNo + "nooooo niven no");
		}
		
		
	}
	
	

}
