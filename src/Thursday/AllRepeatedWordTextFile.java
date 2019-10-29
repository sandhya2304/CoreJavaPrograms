package Thursday;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class AllRepeatedWordTextFile
{

	public static void main(String[] args)
	{
		
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		
		BufferedReader br = null;
		
		try
		{
			br = new BufferedReader(new FileReader("D:\\Sample.txt"));
			
			String currentLine = br.readLine();
			
			while(currentLine!=null)
			{
				//splitting currentline into words
				String[] words = currentLine.toLowerCase().split(" ");
				
				//iterate each word
				for(String word:words)
				{
					//if word is already present into wordcountmap update its count
					if(wordCount.containsKey(word))
					{
						wordCount.put(word,wordCount.get(word)+1);
					}else
					{
						wordCount.put(word,1);
					}

				}				
				
				 //Reading next line into currentLine
				currentLine = br.readLine();			
				
				System.out.println(wordCount);
				
				 //1.Getting all the entries of wordCountMap in the form of Set
				Set<Entry<String,Integer>> entry = wordCount.entrySet();
				
				//2.Creating a List by passing the entrySet
				List<Entry<String,Integer>> listEntry = new ArrayList<Entry<String,Integer>>(entry);
				
				//3.Sorting the list in the decreasing order of values 
				Collections.sort(listEntry,new Comparator<Entry<String,Integer>>()
				{

					@Override
					public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2)
					{
						
						return (o2.getValue().compareTo(o1.getValue()));
					}	
					
				});
				
				//Printing the repeated words in input file along with their occurrences
	             
				System.out.println("Repeated words in file");
				for(Entry<String,Integer> wn:listEntry)
				{
					if(wn.getValue()>1)
					{
						System.out.println(wn.getKey()+" : "+wn.getValue());
					}
				}
				
			}
	
		}catch(Exception ie)
		{
		   ie.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
