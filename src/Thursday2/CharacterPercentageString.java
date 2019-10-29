package Thursday2;

import java.text.DecimalFormat;

public class CharacterPercentageString
{

	public static void main(String[] args)
	{
		
		characterPercentage("Tiger Runs ");  
		
	}
	
	
	public static void characterPercentage(String inputString)
	{
		//Getting total no of characters in the given string
		int totalChars = inputString.length();
		
		int upperCase = 0;
		int lowerCase = 0;
		int digits = 0;
		int others = 0;
		
		//Iterating through each character of inputString
		for(int i=0 ;i<totalChars;i++)
		{
			char ch = inputString.charAt(i);
			 //If ch is in uppercase, then incrementing upperCaseLetters
			
			if(Character.isUpperCase(ch))
			{
				upperCase++;
			}
			
			else if(Character.isLowerCase(ch))
			{
				lowerCase++;
			}
			else if(Character.isDigit(ch))
			{
				digits++;
			}else
			{
				others++;
			}		
		}
		
		//Calculating percentage of uppercase letters, lowercase letters, digits and others
		
		double upperCaseLetterPerc = (upperCase * 100.0) /totalChars;
		double lowerCaseLetterPerc = (lowerCase * 100.0) /totalChars;
		double digitsPerc = (digits * 100.0) /totalChars;
		double otherPerc = (others * 100.0) /totalChars;
		
		 DecimalFormat formatter = new DecimalFormat("##.##");
         
	        //Printing percentage of uppercase letters, lowercase letters, digits and other characters
	         
	        System.out.println("In '"+inputString+"' : ");
	         
	        System.out.println("Uppercase letters are "+formatter.format(upperCaseLetterPerc)+"% ");
	         
	        System.out.println("Lowercase letters are "+formatter.format(lowerCaseLetterPerc)+"%");
	         
	        System.out.println("Digits Are "+formatter.format(digitsPerc)+"%");
	         
	        System.out.println("Other Characters Are "+formatter.format(otherPerc)+"%");
	         
	        System.out.println("-----------------------------");
	    }
		
		
	}


