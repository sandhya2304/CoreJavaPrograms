package saturday19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordFile
{
	public static void main(String[] args) throws IOException {
		
		String line;
		int count = 0;
		
		FileReader file = new FileReader("D:\\file.txt");
		BufferedReader reader = new BufferedReader(file);
		
		while((line = reader.readLine())!=null)
		{
			//Splits each line into words  
			String[] word = line.split("");
			 //Counts each word  
			count = count+word.length;
		}
		
		System.out.println("number of words..."+count);
		
		reader.close();
	}
	

}
