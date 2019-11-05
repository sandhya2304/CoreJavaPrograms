package Tuesday5;

public class PermutationDemo
{
	public static void main(String[] args)
	{
		String str = "abc";
		int n  =str.length();
		PermutationDemo pd = new PermutationDemo();
		pd.permute(str, 0,n-1);

	}
	
	private void permute(String str,int l,int r)
	{
		if(l == r)
		{
			System.out.println(str);
		}else
		{
			for(int i = l;i <= r;i++)
			{
				str = swap(str, l, i);
				permute(str, l+1, r);
				str = swap(str,l,i);
			}
			
		}
		
	}
	
	public String swap(String a,int i,int j)
	{
		char temp;
		char[] ch = a.toCharArray();
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		
		return String.valueOf(ch);
	}

}
