package wednesday6;

public class Person 
{
	
	private String name;
	private String rollno;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", rollno=" + rollno + "]";
	}

	public Person(String name, String rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	
	

}
