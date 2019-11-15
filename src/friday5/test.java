package friday5;

public class test 
{
	public static void main(String[] args)
	{
		IntLinkedList ll = new IntLinkedList(2);
		ll.insertItem(1);
		ll.insertItem(3);
		ll.insertItem(6);
		
		ll.printList();
		
	//	ll.deleteItem(3);
		
		//ll.printList();
		System.out.println("*************");
		ll.sortList();
		
		ll.printList();

	}

}
