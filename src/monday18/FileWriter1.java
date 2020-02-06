package monday18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter1
{
	public static void main(String[] args) 
	{
		
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		PrintWriter printWriter = null;
		
		try
		{
		   fileWriter = new FileWriter("D:\\sample.txt",true);
		   	bufferedWriter = new BufferedWriter(fileWriter);
		   	printWriter = new PrintWriter(bufferedWriter);
		   	
		   	printWriter.println();
			printWriter.println("sandhya : 1234");
			printWriter.println("mina : 34");
			printWriter.println("sheena : 12");
			
			System.out.println("done...");
			
		}catch(Exception ie)
		{
			ie.printStackTrace();
		}
		 finally
	        {
	            //Closing the resources
	             
	            try
	            {
	                printWriter.close();
	                bufferedWriter.close();
	                fileWriter.close();
	            }
	            catch (IOException e)
	            {
	                e.printStackTrace();
	            }
	        }
	    }   
	}