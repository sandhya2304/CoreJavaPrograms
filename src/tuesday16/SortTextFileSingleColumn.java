package tuesday16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class SortTextFileSingleColumn
{
	public static void main(String[] args) 
	{
		
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		ArrayList<String> lines = new ArrayList<String>();
		
		try
		{
			reader = new BufferedReader(new FileReader("D://file1.txt"));
			
			String currentLine = reader.readLine();
			
			while(currentLine!=null)
			{
				lines.add(currentLine);
				currentLine = reader.readLine();
			}
			
			Collections.sort(lines);
			
			writer = new BufferedWriter(new FileWriter("D://file2.txt"));
			for(String s:lines)
			{
				writer.write(s);
				writer.newLine();
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
