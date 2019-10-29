package Friday;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class SortTextFileSingleColumn 
{

	public static void main(String[] args)
	{
		
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		ArrayList<String> lines= new ArrayList<String>();
		
		try
		{
			 //Creating BufferedReader object to read the input file
			reader = new BufferedReader(new FileReader("D:\\File1.txt"));
			
			 //Reading all the lines of input file one by one and adding them into ArrayList
			String currentLine = reader.readLine();
			
			while(currentLine!=null)
			{
				//store in araylist
				lines.add(currentLine);				
				currentLine  = reader.readLine();				
			}
			
			 //Sorting the ArrayList
			Collections.sort(lines);
			
			//Creating BufferedWriter object to write into output files
			writer = new BufferedWriter(new FileWriter("D:\\File2.txt"));
			
			  //Writing sorted lines into output file
			
			for(String line:lines)
			{
				writer.write(line);
				writer.newLine();
			}
		
			
	
		}catch(Exception ie)
		{
			ie.printStackTrace();
		}
		
		
		

	}

}
