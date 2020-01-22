package wednesday16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AppendTestFile 
{
	public static void main(String[] args)
	{
		
		FileWriter fileWriter = null;
		BufferedWriter buffWriter =null;
		PrintWriter print = null;
				
		try
		{
			fileWriter = new FileWriter("D://file3.txt",true);
			buffWriter = new BufferedWriter(fileWriter);
			print = new PrintWriter(buffWriter);
			
			print.println();
			print.println("abc 1");
			print.println("def 2");
			print.println("ghi 3");
			
			System.out.println("done!!!");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
