package friday19;

public class Fact100
{
	public static void main(String[] args) {
		
		int number = 100;
		
		for(int i=1;i<number;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j ==0)
				{
					System.out.println(j+" ");
				}
			}
			
		}
		
		
	}
	 
	

}
