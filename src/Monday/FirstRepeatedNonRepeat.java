package Monday;

import java.util.HashMap;
import java.util.Scanner;

public class FirstRepeatedNonRepeat {

	public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		String w = sc.next();
		
		
       repeatNonRepeat(w);
	}

	public static void repeatNonRepeat(String inputString)
	{
		
		HashMap<Character,Integer> countMap = new HashMap<Character, Integer>();
		char[] str = inputString.toCharArray();
		
		for(char c : str)
		{
			if(countMap.containsKey(c))
			{
				countMap.put(c,countMap.get(c)+1);
			}else
			{
				countMap.put(c,1);
			}
			
		}
		
		System.out.println(countMap);
		
		//first non repeated characters
		for(char c:str)
		{
			if(countMap.get(c)==1)
			{
				System.out.println("First non repeated charatcer"+inputString+"character  :"+c);
			    break;
			}
		}
		
		//first  repeated characters
				for(char c:str)
				{
					if(countMap.get(c)>1)
					{
						System.out.println("First  repeated charatcer"+inputString+"character   :"+c);
					    break;
					}
				}
				
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
