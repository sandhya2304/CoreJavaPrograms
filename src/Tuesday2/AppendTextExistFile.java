package Tuesday2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AppendTextExistFile
{

	public static void main(String[] args) 
	{
		
		FileWriter fileWriter = null;
		BufferedWriter bufferWriter = null;
		PrintWriter printWriter = null;
		
		
		try
		{
			
			
			 fileWriter = new FileWriter("D:\\File2.txt",true);
             
	            //Wrapping FileWriter object in BufferedWriter
	             
			 bufferWriter = new BufferedWriter(fileWriter);
			
		//	Open an existing text file in an append mode by passing ‘true’ 
		//	bufferWriter = new BufferedWriter(new FileWriter("D:\\File1.txt",true));
			
			 //Wrapping BufferedWriter object in PrintWriter
			
			printWriter = new PrintWriter(bufferWriter);
			
			 //Bringing cursor to next line
			printWriter.println();
			
			//writeing text to file
			printWriter.println("sandhya: 71");
			printWriter.println("beeba: 79");
			printWriter.println("himani: 91");
			printWriter.println("tina: 81");
			
			System.out.println("Done");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}

}
