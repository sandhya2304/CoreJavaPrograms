package wednesday6;

public class PersonStack
{

	
	private Person[] stack;
	private int size;
	private int top;
	
	public PersonStack()
	{
		top = -1;
		size = 50;
		stack = new Person[50];
	}
	
	public PersonStack(int size)
	{
		top = -1;
		size = this.size;
		stack = new Person[this.size];
	}
	
	public boolean push(Person item)
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
	
	public Person pop()
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
	
	public void display()
	{
		System.out.println(":printing   ");
		for(int i=top;i>=0;i--)
		{
			System.out.println(stack[i]);
		}
		
	}
	

}
