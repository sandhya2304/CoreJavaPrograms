package sunday1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person
{
	private String name;
	private int age;
	
	
	
	public Person(String name, int age) {
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
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}



	public static void main(String[] args)
	{
		List<Person> lists = new ArrayList<>(Arrays.asList(
				new Person("sandhya",19),
				new Person("sama",15),
				new Person("sik",11)
				));
		
		Collections.sort(lists,new Comparator<Person>()
		{

			@Override
			public int compare(Person p1, Person p2) {
				return p1.age - p2.age;
			}
			
		});
		
		
		System.out.println(lists);

	}

}
