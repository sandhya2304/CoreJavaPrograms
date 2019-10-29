package Tuesday2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWordTextFile {

	public static void main(String[] args) throws IOException 
	{
		
		HashMap<String,Integer> wordCount = new HashMap<String, Integer>();
		
		BufferedReader br= new BufferedReader(new FileReader("D:\\File1.txt"));
		
		String currentLine = br.readLine();
		
		while(currentLine!=null)
		{
			String[] words = currentLine.toLowerCase().split(" ");
					
			for(String s:words)
			{
				if(wordCount.containsKey(s))
				{
					wordCount.put(s,wordCount.get(s)+1);
				}else
				{
					wordCount.put(s,1);
				}
				
			}
			currentLine = br.readLine();
			
		}
		
		System.out.println(wordCount);
		
		String mostRepeatedWords= null;
		int count = 0;
		
		Set<Entry<String,Integer>> entry = wordCount.entrySet(); 
		
		for(Entry<String,Integer> s:entry)
		{
			if(s.getValue() > count)
			{
				mostRepeatedWords = s.getKey();
				count = s.getValue();
			}
		}
		
		System.out.println("repetd words: "+mostRepeatedWords);
		System.out.println("no jo jada bar aya hai occuence"+count);
		
	}

}
