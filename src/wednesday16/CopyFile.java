package wednesday16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile
{
	public static void main(String[] args)
	{
		File srcFile = new File("D://student.txt");
		File destFile = new File("D://file2.txt");
		
		FileInputStream inp = null;
		FileOutputStream fio = null;
		
		try
		{
			
			inp = new FileInputStream(srcFile);
			fio = new FileOutputStream(destFile);
			
			byte[] buffer = new byte[1024];
			int length;
			
			while((length = inp.read(buffer)) != -1)
			{
				fio.write(buffer,0,length);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("hhhhh");

	}

}
