package wednesday7;

public class BST
{
	
	Node root;
	
	public BST()
	{
		root = null;
	}
	
	public boolean insertItem(Person item)
	{
		Node n  = new Node();
		n.data = item;
		n.lc = null;
		n.rc = null;
		 if(root == null)
		 {
			 root = n;
			 return true;
		 }
		 Node p =null;
		 Node c = null;
		 while(c!=null)
		 {
			 p = c;
			 if(item.getName().compareTo(c.data.getName()) < 0)
			 {
				 c = c.lc;
			 }else
			 {
				 c = c.rc;
			 }			 
		 }
		 if(item.getName().compareTo(p.data.getName()) < 0)
		 {
			 p.lc = n;			 
		 }else
		 {
			 p.rc = n;
		 }		 
		 return true;
	}
	
	
	public void showAll(Node n)
	{
		Node p = n ;
		if(p!=null)
		{
			System.out.print(p.data);
			showAll(p.lc);
			showAll(p.rc);
		}
		
	}
	
	public Node findNode(String key)
	{
		Node c = root;
		while(c != null)
		{
			if(key.compareTo(c.data.getName()) == 0)
			{
				break;
			}if(key.compareTo(c.data.getName()) < 0)
			{
				c = c.lc;
			}else
			{
				c = c.rc;
			}			
		}
		return c;
	}
	
	
	

}

class Node
{
	Node lc;
	Node rc;
	Person data;
	
	
}