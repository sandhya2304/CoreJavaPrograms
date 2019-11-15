package friday5;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	
	

}
