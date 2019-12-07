package wednesday6;

public class StackDemo {

	public static void main(String[] args) 
	{
		IntStack ss = new IntStack();
		
		if(!ss.isFull())
		{
		ss.push(1);
		ss.push(2);
		}
		
		System.out.println(ss.pop());
		System.out.println(ss.pop());
       System.out.println(ss.isEmpty());
	
	
	}

}
