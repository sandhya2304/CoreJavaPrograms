package Wednesday2IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWordTextFile {

	public static void main(String[] args) 
	{
		
		
		HashMap<String,Integer> wordCount = new HashMap<String, Integer>();
		BufferedReader br = null;
		
		
		try
		{
			br = new BufferedReader(new FileReader("D:\\Sample.txt"));
		
			//read first line
			String currentLine = br.readLine();
			
			while(currentLine!=null)
			{
				
				String[] words = currentLine.toLowerCase().split(" ");
				
				for(String w:words)
				
				{
					if(wordCount.containsKey(w))
					{
						//if word present update its count
						wordCount.put(w,wordCount.get(w)+1 );
					}else
					{
						//otheerwise giev value 1
						wordCount.put(w, 1);
					}
				}
				//read next line
				currentLine = br.readLine();
				
			}
			//show repeated words
			System.out.println(wordCount);
			
			
			//most repeated word and its occruence
			String mostRepeatedWord = null;
			
			int count = 0;
			
			
			//iterating map
			Set<Entry<String,Integer>> entrySet = wordCount.entrySet();
			for(Entry<String,Integer> entry : entrySet)
			{
				if(entry.getValue() > count)
				{
					mostRepeatedWord = entry.getKey();
					count =entry.getValue();
				}
				
			}
			
			System.out.println("most repested words "+mostRepeatedWord);
			
			System.out.println("no of occurence/appeared" +count);
			
			
		}catch(IOException ie)
		{
			System.out.println(ie.getMessage());
		}
		

	}

}
