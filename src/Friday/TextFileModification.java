package Friday;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TextFileModification 
{
	
	public static void main(String[] args) 
	{
          modifyFile("D:\\File2.txt","90","50");
	     System.out.println("Done");
	}
   
	 public static void modifyFile(String filepath,String oldString,String newString)
	 {
		File fileModify = new File(filepath);
		
		//Initialize oldContent with an empty string.
		//This String object will hold all the old content of the input text file.
		//
		
		String oldContent = "";
		BufferedReader br = null;
		
		FileWriter writer = null;
	
		
		try
		{
			br = new BufferedReader(new FileReader(fileModify));
			//Reading all the lines of input text file into oldContent
			String line = br.readLine();
			
			while(line!=null)
			{
				oldContent = oldContent + line + System.lineSeparator();
				line = br.readLine();		
			}
			  //Replacing oldString with newString in the oldContent
			
			String newContent = oldContent.replaceAll(oldString,newString);
			 //Rewriting the input text file with newContent
			writer = new FileWriter(fileModify);
			writer.write(newContent);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	 }
	

}
