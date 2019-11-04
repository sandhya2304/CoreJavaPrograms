package Monday4;

public class AllSubset
{
	public static void main(String[] args)
	{
		char[] set = {'a','b','c'};
        printSubset(set);
	}
	
	public static void printSubset(char ch[])
	{
		int n = ch.length;
		
		 // Run a loop for printing all 2^n 
        // subsets one by obe 
		for(int i=0; i < (1<<n);i++)
		{
			System.out.print("{");
			
			for(int j=0;j < n ;j++)
			
				// (1<<j) is a number with jth bit 1 
                // so when we 'and' them with the 
                // subset number we get which numbers 
                // are present in the subset and which 
                // are not 
				if((i & (i << j)) > 0)
				
					System.out.print(ch[j]+" ");
				
				System.out.println("}");
			
			
		}
		
	}

}
