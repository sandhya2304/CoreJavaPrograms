package Tuesday2;

import java.io.BufferedReader;
import java.io.FileReader;

public class WordCountInFile {

	public static void main(String[] args)
	{
	  	BufferedReader br = null;
	  	
	  	
	  //Initializing charCount, wordCount and lineCount to 0
	  	int charCount = 0;
	  	int wordCount = 0;
		int lineCount = 0;
		
		try
		{
			 //Creating BufferedReader object
			br = new BufferedReader(new FileReader("D:\\File1.txt"));
		
			//Reading the first line into currentLine
			String currentLine = br.readLine();
			
			while(currentLine!=null)
			{
				
				 //Updating the lineCount
				lineCount++;
				
				 //Getting number of words in currentLine
				String[] words= currentLine.split(" ");
				
				
				  //Updating the wordCount
				wordCount = wordCount + words.length;
 				
				for(String s:words)
 				{
					//Updating the charCount
 					charCount = charCount + s.length();
 				}
				
				currentLine = br.readLine();
			}
			
			System.out.println("char count no of chars....."+charCount);
			System.out.println("no of words ina file: "+wordCount);
			System.out.println("no of lines in a file"+lineCount);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
