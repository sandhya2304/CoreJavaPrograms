package saturday19;

public class VowelSwitch
{
	public static void main(String[] args) {
		
		String word = "sandhya";
		int count = 0;
		
		char[] c = word.toCharArray();
		
		for(char ch:c)
		{
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		  count++;  
		  break;
		}
		}
		System.out.println(count);
	}

}
