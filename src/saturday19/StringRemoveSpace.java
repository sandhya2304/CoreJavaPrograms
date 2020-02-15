package saturday19;

public class StringRemoveSpace
{
	public static void main(String[] args) {
		
		String word = "sandhya sharma";
		
		word = word.replaceAll("\\s","");
		System.out.println(word);
		
	}

}
