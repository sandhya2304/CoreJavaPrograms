package sunday1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>
{
	private String name;
	private int age;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	

	@Override
	public int compareTo(Employee emp) 
	{
		return this.age-emp.age;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args)
	{
		List<Employee> lists = new ArrayList<Employee>(Arrays.asList(
				new Employee("neha",20),
				new Employee("shiv",1)
				));
	
		Collections.sort(lists);
	System.out.println(lists);
	}
	

}
