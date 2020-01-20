package friday10;

public class InQueue
{

	 private int[] queue;
	 private int total;
	 private int size;
	 private int front;
	 private int rear;
	 
   public InQueue()
  {
	  total = 0;
	  size = 100;
	  front = 0;
	  rear = 0;
	  queue = new int[size];
  }
	
   public InQueue(int size)
   {
	     total = 0;
		  this.size = size;
		  front = 0;
		  rear = 0;
		  queue = new int[this.size];
	   
   }
	public boolean isAvaialable()
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
		if(isAvaialable())
		{
			return false;
		}else
		{
		   total++;
		   queue[rear]  = item;
		   rear = (rear+1) % size;
			return true;
		}
	}
   
	public int dequeue()
	{
		int item = queue[front];
		total--;
		front = (front+1) % size;
		
		return item;
	}
	
	public void display()
	{
		System.out.println(" queueue...");
		int f = front;
		if(total!=0)
		{
		   for(int i = 0;i < total;i++)	
		   {
			   System.out.println(" "+queue[i]);
			   f = (f+1) % size;
		   }
		}
		
	}
	
	public static void main(String[] args)
	{
		InQueue qq = new InQueue();
		qq.enqueue(12);
		qq.enqueue(13);
		qq.enqueue(14);
		
		qq.display();
		System.out.println("----");
		qq.dequeue();
		
		qq.enqueue(16);
		
		qq.display();
		
	}

}
