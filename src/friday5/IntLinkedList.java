package friday5;

public class IntLinkedList
{
	private Node head;
	
	public IntLinkedList(int item)
	{
		head = new Node();
		head.value = item;
		head.link = null;
	}
	
	public boolean insertItem(int item)
	{
		Node n = new Node();
		n.value = item;
		n.link = head;
		head = n;
		
		return true;
	}
	
	public boolean deleteItem(int item)
	{
		if(head.value == item)
		{
			head = head.link;
			return true;
		}else
		{
			Node x = head;
			Node y = head.link;
			while(true)
			{
				if(y == null || y.value == item)
				{
					break;
				}else
				{
					x = y;
					y = y.link;
				}				
			}
			if(y != null)
			{
				x.link = y.link;
				return true;
			}else
			{
				return false;
			}
		}
		
	}
	
	public void sortList()
	{
		int c = 0;
		Node a = head.link;
		while(a.link!=null)
		{
			Node b = head.link;
			while(b.link!=null)
			{
				if(b.value < b.link.value)
				{
				c = b.value;
				b.value = b.link.value;
				b.link.value = c;
				}
				b = b.link;
			}
			a = a.link;
		}
		
	}
	
	public void printList()
	{
		Node z = head;
		while(z!=null)
		{
			System.out.println(z.value);
			z = z.link;
		}
	}
	
}

class Node
{
	 int value;
	 Node link;	
}