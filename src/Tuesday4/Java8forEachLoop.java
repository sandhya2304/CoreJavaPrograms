package Tuesday4;

import java.util.ArrayList;
import java.util.List;

public class Java8forEachLoop {

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("lichi");
		
		
		list.forEach((a) ->
		System.out.println(a));
		
		Sayaa person = (m)->{
			String s1 = "hello sandhya";
			String s2 = s1 + m;
			return s2;
		};
		System.out.println(person.hello("time is precious..."));

	}

}
