package Wednesday2IO;

import java.io.File;

public class ListSubDirectory {

	public static void main(String[] args) 
	{
		
		File folder = new File("D:\\");
		
		File[] files = folder.listFiles();
		
		for(File f:files)
		{
			if(f.isDirectory())
			{
				System.out.println(f.getName());
			}
		}
		
		

	}

}
