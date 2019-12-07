package saturday7;

public class StackDemo 
{
	
	int []stack;
	int size;
	int top;
	
	
	public StackDemo()
	{
		top = -1;
		size = 60;
		stack = new int[60];
	}
	
	public StackDemo(int size)
	{
		top = -1;
		this.size = size;
		stack = new int[this.size];
	}
	
	public boolean push(int item)
	{
		if(!isfull())
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
	
	public boolean isfull()
	{
		return (stack.length-1 == top);
	}
	
	public void print()
	{
		System.out.println("display----");
		for(int i= top;i >=0;i--)
		{
			System.out.println(stack[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		StackDemo demo = new StackDemo();
		demo.push(12);
		demo.push(14);
		demo.push(9);
		demo.push(55);
		
		demo.print();
		
		//System.out.println(demo.pop());
		
	}
	
	
	

}
