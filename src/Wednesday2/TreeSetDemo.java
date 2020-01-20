package Wednesday2;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args)
	{
		
		MyComparator my =new MyComparator();
		TreeSet<Student> tree = new TreeSet<Student>(my);
		
		tree.add(new Student(1,"sandhya",51));
		tree.add(new Student(2,"ria",11));
		tree.add(new Student(2,"andhya",81));
		tree.add(new Student(4,"ndhya",31));
		tree.add(new Student(5,"dhya",21));
		
		Iterator<Student> it =tree.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
