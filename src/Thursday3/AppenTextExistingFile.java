package Thursday3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AppenTextExistingFile
{
	public static void main(String[] args)
	{
		
		try
		{
			
			FileWriter writer = new FileWriter("D:\\abc.txt",true);
			BufferedWriter bw = new BufferedWriter(writer);
			PrintWriter pw = new PrintWriter(bw);
			pw.println();
			
			pw.println("sandhya : 25000");
			pw.println("mona : 29000");
			pw.println("nina : 21000");
			
			System.out.println("Done");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
