package saturday19;

public class FindSubset
{
	public static void main(String[] args) {
		
		String word = "sandhya";
		int len = word.length();
		
		int temp = 0;
		
	  //Total possible subsets for string of size n is n*(n+1)/2  
		String str[]  = new String[len*(len+1)/2];
		
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				//starting and end
				str[temp] = word.substring(i,j+1);
				temp++;
			}
		}
		System.out.println("all subsets");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		System.out.println(temp);
	}

}
