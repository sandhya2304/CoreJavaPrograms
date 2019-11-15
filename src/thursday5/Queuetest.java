package thursday5;

public class Queuetest {

	public static void main(String[] args) 
	{
		IntQueue ii = new IntQueue();
		ii.enqueue(11);
		ii.enqueue(22);
		ii.enqueue(32);
		ii.enqueue(42);

		
	//	System.out.println(ii.dequeue());
	
	ii.showAll();
	}

}
