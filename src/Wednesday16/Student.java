package Wednesday16;

public class Student
{
	 int id;
	 String name;
	 int percentage;
	
	public Student(int id, String name, int percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	
	
	
	

}
