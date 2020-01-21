package tuesday16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareTextFile1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br1 = new BufferedReader(new FileReader("D:/file1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("D:/file2.txt"));
		
		String line1 = br1.readLine();
		String line2 = br2.readLine();
		
		boolean areEqual = true;
		
		int lineNum = 1;
		
		while(line1!=null || line2 !=null)
		{
			if(line1 ==null || line2==null)
			{
				break;
			}else if(! line1.equalsIgnoreCase(line2))
			{
				 areEqual = false;
				break;
			}
			
			line1 = br1.readLine();
			line2 = br2.readLine();
			
			lineNum++;
		}
		if(areEqual)
		{
			System.out.println("two files have same content");
		}else
		{
			System.out.println("both file different :");
			System.out.println("line 1 ="+line1+" : "+"line 2 ="+line2);
		}
		
	}

}
