package wednesday16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MostRepeatedWords
{
	public static void main(String[] args)
	{
		HashMap<String,Integer> wordCount = new HashMap<String, Integer>();
		
		BufferedReader reader = null;
		
		try
		{
			reader = new BufferedReader(new FileReader("D://file.txt"));
			String currentLine = reader.readLine();
			
			while(currentLine!=null)
			{
				String[] words = currentLine.toLowerCase().split(" ");
				
				for(String word:words)
				{
					if(wordCount.containsKey(word))
					{
						wordCount.put(word, wordCount.get(word)+1);
					}else
					{
						wordCount.put(word, 1);
					}
				}
				
				currentLine = reader.readLine();
			//	System.out.println(wordCount);
			}
			
			String mostRepeatedWord = null;
			int count = 0;
			
			Set<Entry<String,Integer>> entrySet = wordCount.entrySet();
			
			for(Entry<String,Integer> entry:entrySet)
			{
				if(entry.getValue() > count)
				{
					mostRepeatedWord = entry.getKey();
					count = entry.getValue();
				}
			}
			
			System.out.println("mosts repeated word "+mostRepeatedWord);
			System.out.println("noo of occurence "+count);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
