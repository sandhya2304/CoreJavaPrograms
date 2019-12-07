package saturday7;

public class QueueDemo {
	int qq[];
	int total;
	int size;
	int front;
	int rear;

	public QueueDemo()
	{
		total = 0;
		size = 100;
		front = 0;
		rear = 0;		
		qq = new int[size];
	}
	
	public QueueDemo(int size)
	{
		total = 100;
		this.size =size;
		front = 0;
		rear = 0;		
		qq = new int[this.size];
	}
	
	public boolean enqueue(int item)
	{
		if(isFull())
		{
			return false;
		}else
		{
			total++;
			qq[rear]  = item;
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
		int f = front;
		if(total!=0)
		{
			for(int i=0;i<total;i++)
			{
			System.out.println(qq[f]+" ");
			f = (f+1) % size;
			}
		}
		
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
	
	

	public static void main(String[] args)
	{
		QueueDemo qq =new QueueDemo();
		qq.enqueue(14);
		qq.enqueue(15);
		
		qq.display();
		
		qq.dequeue();
		
		qq.display();

	}

}
