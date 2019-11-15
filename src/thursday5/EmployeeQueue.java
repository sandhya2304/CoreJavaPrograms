package thursday5;

public class EmployeeQueue
{
	
	private Employee[] qq;
	private int size;
	private int total;
	private int front;
	private int rear;
	
	public EmployeeQueue()
	{
		size = 100;
		total = 0;
		front = 0;
		rear = 0;
		qq = new Employee[size];
	}
	
	public EmployeeQueue(int size)
	{
		this.size = size;
		total = 0;
		front = 0;
		rear = 0;
		qq = new Employee[size];
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
	
	public boolean enqueue(Employee item)
	{
		if(isFull())
		{
			return true;
		}else
		{
			total++;
			qq[rear] = item;
			rear = (rear+1) % size;
			return true;
		}	
	}
	
	public Employee dequee()
	{
		Employee item = qq[front];
		total--;
		front = (front+1) % size;
		return item;
	}
	
	public void showAll()
	{
		int f = front;
		if(total!=0)
		{
			for(int i=0;i<total;i++)
			{
				System.out.println(" "+qq[f]);
				f = (front+1) % size;
			}
		}
	}
	public static void main(String []args)
	{
		EmployeeQueue eq= new EmployeeQueue();
		Employee ee = new Employee(1,"sandhya");
		Employee e1 = new Employee(2,"harsh");
		
		eq.enqueue(ee);
		eq.enqueue(e1);
		
		eq.showAll();
		
		eq.dequee();
		
		eq.showAll();
		
	}
	
}
