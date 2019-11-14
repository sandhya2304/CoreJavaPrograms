package tuesday6;

public class ArrayValue 
{
	public static void main(String[] args)
	{
 
		int []ar = {1,2,3,4,5};
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	     int find = 13;
	     boolean exist = false;
	     
	     for(int n:ar)
	     {
	    	 if(n == find)
	    	 {
	    		 exist = true;
	    	 }
	     }
		if(exist)
		{
			System.out.println("found numnber"+find);
		}else
		{
			System.out.println("not found "+find);
		}
		
		System.out.println("----------------------------");
		String words = "the name is here";
		
		String check = "namess";
		boolean found = false;
		
		if(words.contains(check))
		{
			found = true;
		}
		
		if(found)
		{
			System.out.println("exiests "+check);
		}else
		{
			System.out.println("not exist"+check);
		}
	}

}
