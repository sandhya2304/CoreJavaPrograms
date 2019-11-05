package Tuesday5;

public class RemoveWhiteSpace {

	public static void main(String[] args)
	{
		String s = "remove white space";
		
		s = s.replaceAll("\\s","");

		System.out.println("after removing space "+s);
	}

}
