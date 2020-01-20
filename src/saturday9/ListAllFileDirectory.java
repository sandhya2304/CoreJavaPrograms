package saturday9;

import java.io.File;

public class ListAllFileDirectory
{
	public static void main(String[] args)
	{
		File folder = new File("D:\\");
		
		File[] files= folder.listFiles();
		for(File s:files)
		{
			if(s.isFile())
			{
				System.out.println(s.getName());
			}else if(s.isDirectory())
			{
				System.out.println(s.getAbsolutePath());
			}
		}
		

	}

}
