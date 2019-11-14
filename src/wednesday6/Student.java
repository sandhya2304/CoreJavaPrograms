package wednesday6;

import java.util.Scanner;

public class Student
{
	static int id;
	static String name;
	static int score;
	
	public Student() {
		this(0,"",0);
	}
	
	
	public Student(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}


	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		id = sc.nextInt();
		System.out.println("Enter the name:");
		name = sc.next();
		System.out.println("enter the score");
		score = sc.nextInt();
		
		int choice =0 ;
	
		
		switch(choice)
		{
		case 1:
			System.out.println("enter the score");
		    if(score < 50)
		    {
		    	int sum = score + 10;
		    }
		    break;
		case 2:
			System.out.println("entr th score");
		    if(score > 50)
		    {
		    	int sum = score -10;
		    }
			break;
		case 3:
			System.exit(1);
		}
	
		
		
		do
		{
		if(score > 50)
		{
			System.out.println("passed ");
		}else
		{
			System.out.println("failed");
		}
		
	}while(choice!=score);
		
	}

}
