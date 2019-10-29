package Wednesday2IO;

import java.io.File;

public class ListAllFiles {

	public static void main(String[] args)
	{
		
		File folder =new File("D:\\");
		String[] files= folder.list();
		
		for(String f:files)
		{
			System.out.println(f);
		}

	}

}
