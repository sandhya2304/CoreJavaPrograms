package monday16;


public class ILinkedList
{
	Node head;
	
	public ILinkedList(int item)
	{
		head = new Node();
		head.value = item;
		head.link = null;
	}
   	
	public boolean InsertItem(int item)
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
					x = y;
					y = y.link;
				}
			}if(y!=null)
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
	
	public static void main(String[] args) 
	{
		ILinkedList ii = new ILinkedList(12);
		ii.InsertItem(14);
		ii.InsertItem(16);
		
		ii.print();
		
		ii.deleteItem(14);
		System.out.println("--------------");
		ii.print();
	}

}


class Node
{
	Node link;
	int value;
	
}