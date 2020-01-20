package monday16;

public class IStack
{
	
	int stack[];
	int top;
	int size;
	
	
	public IStack()
	{
		top = -1;
		size = 50;
		stack = new int[50];
	}
	public IStack(int s)
	{
		top = -1;
		size = s;
		stack = new int[s];
	}
	
	public boolean push(int item)
	{
		if(!isFull())
		{
			top++;
			stack[top] = item;
			return true;
		}else
		{			
			return false;
		}	
	}
	
	public int pop()
	{
		return stack[top--];
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public boolean isFull()
	{
		return (top == stack.length-1);
	}
	
	public void print()
	{
		System.out.println("------------------");
		for(int i=top;i >=0;i--)
		{
			System.out.println(stack[i]);
		}
		
	}
	public static void main(String[] args)
	{
		IStack ss = new IStack();
		ss.push(12);
		ss.push(14);
		ss.push(16);
		
		ss.print();
		
		ss.pop();
		System.out.println("-----------");
		ss.print();
		
		
	}
	
	
	
}
