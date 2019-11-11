package monday5;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		double a = sc.nextDouble();
		
		System.out.println("Enter second number");
		double b = sc.nextDouble();
		
		System.out.println("Enter operation (+,-,/,*)");
		char c =sc.next().charAt(0);
		
		double result = 0.0;
		
		switch(c)
		{
		case '+':
			System.out.println("for addition");
		    result = a+b;
		    break;
		case '-':
			System.out.println("for subtract");
		    result = a-b;
		    break;
		case '/':
			System.out.println("for divide");
		    result = a/b;
		    break;
		case '*':
			System.out.println("for mulitply");
		    result = a*b;
		    break;
		}
		
		System.out.print("result is: "+result);

	}

}
