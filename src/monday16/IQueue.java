package monday16;



public class IQueue
{
	private int qq[];
	private int total;
	private int size;
	private int front;
	private int rear;
	

	public IQueue() 
	{
		size = 100;
		total = 0;
		front = 0;
		rear = 0;
		qq = new int[100];
	}
	
	public IQueue(int size) 
	{
		total = 0;
		this.size =size;
		front = 0;
		rear = 0;
		qq = new int[size];
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
	
	public boolean enqueue(int item)
	{
		if(isFull())
		{
			return false;
		}else
		{
			total++;
			qq[rear] = item;
			rear = (rear+1) % size;
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
	
	public void display()
	{
		System.out.println("----------");
		int f = front;
		if(total!=0)
		{
			for(int i=0;i<total;i++)
			{
				System.out.println(" "+qq[f]);
				f = (f+1) % size;
			}		
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("---------------------");
		IQueue ii = new IQueue();
		ii.enqueue(11);
		ii.enqueue(12);
		ii.enqueue(14);
		
		ii.display();
		
		ii.dequeue();
		
		System.out.println("-----------");
		ii.display();
		
	}
	
	
	
}
