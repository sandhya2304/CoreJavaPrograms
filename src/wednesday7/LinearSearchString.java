package wednesday7;

public class LinearSearchString
{
	public static void main(String[] args)
	{
		String words[] = {"Sandhya","dena","meera"};
		
		String item = "meer";
		
		int temp = 0;
		
		for(int i=0;i<words.length;i++)
		{
			if(words[i].equals(item))
			{
				System.out.println("number found at "+i+ " item");
				temp = temp+1;
			}
		}
		if(temp == 0)
		{
			System.out.println("number not found...");
		}

	}

}
