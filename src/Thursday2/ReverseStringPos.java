package Thursday2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringPos 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		StringBuilder sb = new StringBuilder(n);
		
		String revS = new StringBuilder(n.replaceAll("","")).reverse().toString();
		
		int count = 0;
		for(int i = 0;i < n.length();i++)
		{
			if(sb.charAt(i)!= ' ')
			{
				sb.setCharAt(i,revS.charAt(count));
				count++;
			}
			
		}
		System.out.println(sb);

	}

}
