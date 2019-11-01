package Friday3;

public class PatternButterfly
{
	public static void main(String[] args) 
	{
		
		Pattern(7);
	}
	
	public static void Pattern (int n)
	{
		//upper half of the pattern 
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j <=(2*n);j++)
			{
				//left part of pattern
				if(i < j)
					System.out.print(" ");
			    else
				
					System.out.print("*");
				
				//right part
				if(i <=((2 * n) - j))
				
					System.out.print(" ");
				else
				
					System.out.print("*");
				}
				
				System.out.println("");
				
			}
		  //this is lower half
		for(int i =1;i<=n;i++)
		{
			for(int j=1;j <= (2*n);j++)
			{
				//left part
				if(i > (n-j+1))
					 System.out.print(" ");
				else
					System.out.print("*");
				
				//right part
				if((i + n ) > j)
					System.out.print(" ");
				else
				   System.out.print("*");
				
				
			}
			System.out.println("");
		}
		
		
		
		
		
		
			
		}
		
		
		
	}
	
	

