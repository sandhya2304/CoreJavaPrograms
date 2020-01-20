package Wednesday2;

import java.util.Comparator;

public class MyComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2)
	{
		
		if(o1.id == o2.id)
		{
		 return 0;
		}else
		{
			return o2.percentage - o1.percentage;
		}
	}
	
	
	

}
