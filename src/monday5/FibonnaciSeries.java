package monday5;

public class FibonnaciSeries 
{
	public static void main(String[] args)
	{
		int t1=0,t2=1;
		
		for(int i=1;i<10;i++)
		{
			System.out.println(t1+" + ");
			int sum = t1+t2;
			t1=t2;
			t2=sum;
			
		}
		
	

	}

}
