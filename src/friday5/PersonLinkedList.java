package friday5;

public class PersonLinkedList 
{
	private Nodes head;
	
	public PersonLinkedList(Person person)
	{
		head  = new Nodes();
		head.person = person;
		head.link = null;
	}
	
	public boolean insertItem(Person person)
	{
		Nodes n = new Nodes();
		n.person = person;
		n.link = head;
		head = n;
		
		return true;
	}
	
	public boolean deleteItem(String name)
	{
		if(name.equals(head.person.getName()))
		{
			head = head.link;
			return true;
		}else
		{
			Nodes x = head;
			Nodes y = head.link;
			
			while((y != null) && (y.person.getName().equals(name)))
			{
					x = y;
					y = y.link;
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
	
	
	public void printList()
	{
		Nodes z = head;
		while(z!=null)
		{
			System.out.println(z.person);
			z = z.link;
					
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
	
		
		Person pe = new Person("Sandhya","1");
		Person pe1 = new Person("harsh","2");
		PersonLinkedList pp = new PersonLinkedList(pe);
		
		pp.insertItem(pe1);
		
		pp.printList();
		
		pp.deleteItem("harsh");
		
		System.out.println("after delete");
	
		pp.printList();
	}
	
	

}
class Nodes
{
	 Nodes link;
	 Person person;
	
}
