package monday18;

import java.io.BufferedReader;
import java.io.FileReader;

public class WordCountInFile
{
	public static void main(String[] args)
	{
		
		BufferedReader reader = null;
		int wordCount = 0;
		int charCount = 0;
		int lineCount =0;
		
		try
		{
			reader = new BufferedReader(new FileReader("D://sample.txt"));
			String currentLine = reader.readLine();
			
			while(currentLine!=null)
			{
				lineCount++;
				
				String[] words = currentLine.split(" ");
				
				wordCount = wordCount+words.length;
				
				for(String word:words)
				{
					charCount = charCount+word.length();
				}
				currentLine = reader.readLine();
			}
			System.out.println("number of words "+wordCount);
			System.out.println("number of character  "+charCount);
			System.out.println("number of line "+lineCount);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
