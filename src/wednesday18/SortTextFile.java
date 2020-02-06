package wednesday18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortTextFile
{
	public static void main(String[] args)
	{
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		ArrayList<String> lines = new ArrayList<String>();
		try
		{
			reader = new BufferedReader(new FileReader("D://sample.txt"));
			String currentLine = reader.readLine();
			
			while(currentLine!=null)
			{
				lines.add(currentLine);
				currentLine = reader.readLine();
			}
			Collections.sort(lines);
			
			writer = new BufferedWriter(new FileWriter("D://sample1.txt"));
			for(String line:lines)
			{
				writer.write(line);
				writer.newLine();
			}
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		 finally
	        {
	            //Closing the resources
	             
	            try
	            {
	                if (reader != null)
	                {
	                    reader.close();
	                }
	                 
	                if(writer != null)
	                {
	                    writer.close();
	                }
	            } 
	            catch (IOException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	    }   
	}