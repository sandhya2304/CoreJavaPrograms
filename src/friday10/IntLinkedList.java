package friday10;

public class IntLinkedList
{
	
	Node head;
	
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
		if(head == null)
		{
			head.value = item;
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
					x  = y;
					y = y.link;	
				}			
			}
			if(y!=null)
			{
				x.link = y.link;
				return true;
			}else
			{
				return false;
			}
		}		
	}
	
	public void print()
	{
		Node z = head;
		while(z!=null)
		{
			System.out.println(z.value);
			z = z.link;
		}
		
	}
	
	public static void main(String[] args) {
		IntLinkedList ll = new IntLinkedList(12);
		ll.insertItem(14);
		ll.insertItem(15);
		
		ll.print();
		
		ll.deleteItem(15);
		
		ll.print();

	}
	
}


class Node
{
	
	int value;
	Node link;
	
}