package thursday5;

public class IntQueue 
{
	
	private int[] qq;
	private int front;
	private int rear;
	private int size;
	private int total;
	
	public IntQueue()
	{
		size = 100;
		front = 0;
		rear = 0;
		total = 0;
		qq = new int[size];
	}
	
	public IntQueue(int size)
	{
		this.size = size;
		front = 0;
		rear = 0;
		total = 0;
		qq = new int[this.size];
	}
	
	public boolean isFull()
	{
		if(size == total)
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	//insert perform at rear and delete at front
	//enqueue insertion and dequque deletion
	public boolean enqueue(int item)
	{
		if(isFull())
		{
			return true;
		}else
		{
			total++;
			qq[rear] = item;
			rear = (rear + 1) % size;
			return true;
		}	
	}
	
	public int dequeue()
	{
		int item = qq[front];
		total--;
		front = (front+1) % size;
		return item;
	}
	
	public void showAll()
	{
		System.out.println("print queue");
		int f =  front;
		if(total!=0)
		{
			for(int i=0;i<total;i++)
			{
				System.out.println(" "+qq[f]);
				f =(f+1)% size;
			}
		}
		
	}
}
