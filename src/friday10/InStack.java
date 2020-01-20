package friday10;

public class InStack
{
	
	private int[] stack;
	private int top;
	private int size;
	
	public InStack()
	{
		top = -1;
		size = 50;
		stack = new int[50];
	}
	
	public InStack(int size)
	{
		top = -1;
		this.size = size;
		stack = new int[this.size];
	}
	
	public boolean push(int item)
	{
		if(!isAvailable())
		{
			top++;
			stack[top]= item;
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
	
	public boolean isAvailable()
	{
		return (top == stack.length-1);
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public void display()
	{
		for(int i = top;i >= 0;i--)
		{
			System.out.println(stack[i]--);
		}
	}
	
	public static void main(String[] args)
	{
		InStack ss = new InStack();
		ss.push(11);
		ss.push(12);
		ss.push(14);
		
		ss.display();
		
		ss.pop();
		ss.pop();
	}
	
	
}
