package wednesday16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileModify 
{
	public static void main(String[] args)
	{
		
		
		modifyFile("D://student.txt", "89", "91");

		System.out.println("done");
	}
	
	public static void modifyFile(String filePath,String oldString,String newString)
	{
		File fileToModify  = new File(filePath);
		String oldContent = "";
		BufferedReader reader =null;
		FileWriter writer = null;
		
		try
		{		
			reader = new BufferedReader(new FileReader(fileToModify));
			String line = reader.readLine();
			
			while(line != null)
			{
				oldContent = oldContent+line+System.lineSeparator();
				line = reader.readLine();
			}
			String newContent = oldContent.replaceAll(oldString,newString);
			writer = new FileWriter(fileToModify);
			writer.write(newContent);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try
			{
			reader.close();
			writer.close();
			}catch(IOException ie)
			{
				ie.printStackTrace();
			}
			
		}
		
	}

}
