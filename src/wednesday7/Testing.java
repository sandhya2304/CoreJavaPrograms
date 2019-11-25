package wednesday7;

public class Testing {

	public static void main(String[] args)
	{
		Person p1 = new Person(15,"abc");
		Person p2 = new Person(13,"lc");
		Person p3 = new Person(98,"cdd");
		Person p4 = new Person(11,"qqq");
		Person p5 = new Person(10,"yuu");
		
		
		BST bb =new BST();
		bb.insertItem(p1);
		bb.insertItem(p3);
		bb.insertItem(p2);
		bb.insertItem(p4);
		bb.insertItem(p5);
		
		
		bb.showAll(bb.findNode("bc"));
		
		

	}

}
