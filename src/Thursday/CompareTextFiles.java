package Thursday;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompareTextFiles
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br1 = new BufferedReader(new FileReader("D:\\File1.txt"));
		
		BufferedReader br2 = new BufferedReader(new FileReader("D:\\File2.txt"));
		
		//Read the lines of file1 into line1 and lines of file2 into line2.
		
		String line1 = br1.readLine();
		
		String line2 = br2.readLine();
		
		boolean areEqual = true;
		
		int lineNum = 1;
		
	//Keep reading the lines of file1 into line1 and lines of file2 into line2 till the 
	//end of the files. If any one of line1 or line2 is null, then assign false to areEqual 
	//and break the loop. If both, line1 and line2, are not null then compare them 
   //using equalsIgnoreCase() method. If it returns true then continue with the loop. 
		//Otherwise break the loop and assign false to areEqual.
		
		
		while(line1 != null || line2 != null)
		{
			if(line1 == null || line2 == null)
			{
				
				areEqual = false;
				break;
			}
			else if (!line1.equalsIgnoreCase(line2))
			{
				areEqual = false;
				break;		
			}
			
			line1 = br1.readLine();
			line2 = br2.readLine();
			
			lineNum++;
			
		}
		
		//If areEqual is true then declare both files have same content.
		//If areEqual is false then declare both files have different content.
		
		if(areEqual)
		{
			System.out.println("two files have same content:");
		}else
		{
			System.out.println("Two file have different content:");
			System.out.println("file1 has "+line1+" file 2 has :"+line2);
		}
		
		
		
		
		
		
	}

}
