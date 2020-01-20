package saturday9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatWordTextFile
{
	public static void main(String[] args)
	{
		
		HashMap<String,Integer> wordCount = new HashMap<String, Integer>();
		BufferedReader br = null;
		
        try
        {     	
        	br = new BufferedReader(new FileReader("D://file.txt"));
        	String currentLine = br.readLine();
        	
        	while(currentLine != null)
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
        	
        	System.out.println("----------------------------");
        	
        	String mostRepeatedWord = null;
        	int count = 0;
        	
        	Set<Entry<String,Integer>> entrySet = wordCount.entrySet();
        	for(Entry<String,Integer> entry: entrySet)
        	{
        		if(entry.getValue() > count)
        		{
        			mostRepeatedWord = entry.getKey();
        			count = entry.getValue();
        		}       		
        	}
        	
        	System.out.println("Most repeated words :"+mostRepeatedWord);
        	System.out.println("the number of repeated..."+count);
        	
        	
        }catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
		
		
		
		
		
		

	}

}
