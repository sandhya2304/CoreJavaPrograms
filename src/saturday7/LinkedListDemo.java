package saturday7;

public class LinkedListDemo
{
	Node head;
	
	public LinkedListDemo(int item) 
	{
		head  = new Node();
		head.value = item;
		head.link = head;
		head = null;		
	}
	
	public void insertItem(int item)
	{
		Node n =new Node();
		n.value = item;
		n.link  = head;
		head = n;
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
				if(y.value == item || y == null )
				{
					break;
				}else
				{
					x = y;
					y = y.link;
				}				
			}if(y != null)
			{
				x.link = y.link;
				return true;
			}else
			{
				return false;
			}
		}	
	}
	
	public void showAll()
	{
		
		Node z = head;
		while(z!=null)
		{
			System.out.println(z.value);
			z = z.link;
		}
		
	}
	
	public static void main(String[] args) {
		LinkedListDemo ll = new LinkedListDemo(12);
		ll.insertItem(15);
		ll.insertItem(16);
		
		ll.showAll();
		
		ll.deleteItem(16);
		
		ll.showAll();
		
		
	}
	

}

class Node
{
	int value;
	Node link;
	
}
