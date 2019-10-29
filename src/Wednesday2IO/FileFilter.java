package Wednesday2IO;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilter {

	public static void main(String[] args)
	{
		
		File file = new File("D:\\");
		
		FilenameFilter fileFilter = new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name)
			{
				
				if(name.endsWith(".txt"))
				{
					return true;
				}
				else
				{
				return false;

				}
			}
		};
		
		File[] files = file.listFiles(fileFilter);
		for(File f:files)
		{
			System.out.println(f);
		}
		
	}

}
