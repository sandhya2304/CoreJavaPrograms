package Sunday;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTextFile
{

	public static void main(String[] args)
	{
		
		File source = new File("D:\\File1.txt");
		File destination = new File("D:\\File2.txt");
		
        FileInputStream fin =null;
        FileOutputStream fout =null;
        
        try
        {
        	fin =new FileInputStream(source);
        	fout =new FileOutputStream(destination);
        	
        	byte[] buffer = new byte[1024];
        	int length ; 
        	
        	while((length = fin.read(buffer))!= -1)
        	{
        		fout.write(buffer,0,length);      		
        	}      	
        }catch(Exception e)
        {
        	e.printStackTrace();
        }
		finally
		{
			try
			{
			fin.close();
			fout.close();
		
			}catch(IOException ie)
			{
				ie.getMessage();
			}
		}
        
        System.out.println("ho gya");
	}

}
