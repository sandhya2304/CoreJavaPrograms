package wednesday6;

public class PersonTest
{
	public static void main(String[] args) 
	{
		PersonStack ps = new PersonStack();
		
		Person p1 = new Person("Sandhya","1");
		
		Person p2 = new Person("dhya","2");
         
		ps.push(p1);
		ps.push(p2);
		
		//System.out.println(ps.pop());
		ps.display();
		
	}

}
