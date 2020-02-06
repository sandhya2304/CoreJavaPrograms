package tuesday18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MostRepeatWord 
{
	public static void main(String[] args)
	{
		
		HashMap<String,Integer> wordCount = new HashMap<String, Integer>();
		
		BufferedReader reader = null;
		
		try
		{
			reader = new BufferedReader(new FileReader("D://sample.txt"));
			String currentLine = reader.readLine();
			
			while(currentLine!=null)
			{
				//splitting the currentLine into words
				String[] words = currentLine.toLowerCase().split("//s");
				
				for(String word : words)
				{
					if(wordCount.containsKey(word))
					{
						wordCount.put(word,wordCount.get(word)+1);
					}else
					{
						wordCount.put(word, 1);
					}
				}	
				currentLine = reader.readLine();	
			}
			
			//System.out.println(wordCount);
			String mostRepeatedWord = null;
			
			int count = 0;
			
			Set<Entry<String,Integer>> entrySet = wordCount.entrySet();
			for(Entry<String,Integer> e:entrySet)
			{
				if(e.getValue()>count)
				{
					mostRepeatedWord = e.getKey();
					count = e.getValue();
				}
			}
			System.out.println("most repeated words .."+mostRepeatedWord);
		    System.out.println(wordCount);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
