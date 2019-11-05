package Tuesday5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWordHashMap
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the word:");
        String word = sc.nextLine();
        // first let us split string into words
        String[] words =word.split(" ");
      
        
     // adds all words into a map
        // we also check whether the word is already in map!
        Map<String,String> wordMap = new HashMap<String, String>();
        for(int i=0;i<words.length;i++)
        {
        	String s = words[i].toLowerCase();
        	if(wordMap.get(s)!=null)
        	{
        		System.out.println("duplicate word "+s);
        	}else
        	{
        		wordMap.put(s,s);
        	}
        	
        }
        
		
		
	}

}
