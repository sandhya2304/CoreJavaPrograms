package Wednesday2IO;

import java.io.File;

public class FilesInDirectoryAndItsSubDirectory {

	public static void main(String[] args)
	{
        File folder = new File("D:\\");
		
		File[] files = folder.listFiles();
		
		for(File f:files)
		{
			if(f.isFile())
			{
			 System.out.println(f.getName());
		   }else if(f.isDirectory())
		   {
			   System.out.println(f.getAbsolutePath());
		   }
		}
			

	}

}
