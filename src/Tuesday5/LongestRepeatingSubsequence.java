package Tuesday5;

public class LongestRepeatingSubsequence
{
	public static void main(String[] args) 
	{
		String str = "abcdefghiabccccddddd";
		String lrs = "";
		
		int n = str.length();
		for(int i=0;i<n;i++)
		{
			for(int j = i+1;j<n;j++)
			{
				String x = findLonestSubsequnce(str.substring(i,n),str.substring(j,n));
				
				if(x.length() > lrs.length()) lrs =x;
			}
		}
       System.out.println("longest repeating sequnce : "+lrs);
	}
	
	public static String findLonestSubsequnce(String str,String t)
	{
		int n = Math.min(str.length(),t.length());
		
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)!= t.charAt(i))
			{
				return str.substring(0,i);
			}
		}
		return str.substring(0,n);	
	}
}
