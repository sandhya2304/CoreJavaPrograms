package Saturday;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortTextFileMultipleColumn {

	public static void main(String[] args) throws IOException
	{
		
		BufferedReader reader = new BufferedReader(new FileReader("D:\\File1.txt"));
		
		ArrayList<Student> studentRecords = new ArrayList<>();
		
		 //Reading Student records one by one
        
		String currentLine = reader.readLine();
		
		
     //Read every student record from input text file. For each student record, create one
		//Student object and add that Student object into studentRecords.

	while(currentLine!=null)
	{
			String[]  studentDetails = currentLine.split(" ");
			String name= studentDetails[0];
			
			int marks= Integer.valueOf(studentDetails[1]);
			
			//Creating Student object for every student record and adding it to ArrayList
			
			studentRecords.add(new Student(name, marks));
			currentLine = reader.readLine();					
	}		
	      //Sorting ArrayList studentRecords based on marks
			Collections.sort(studentRecords,new MarksCompare());
		
			//Creating BufferedWriter object to write into output text file	         
			BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\File2.txt"));
			
			for(Student s: studentRecords)
			{
				writer.write(s.getName());
				writer.write(" "+ s.getMarks());
				writer.newLine();
			}
			//close the resources
			reader.close();
			writer.close();
			
		

	}

}
