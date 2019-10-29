package Wednesday2IO;

import java.io.File;

public class IndividaulFile {

	public static void main(String[] args)
	{
		File file = new File("D:\\");
		
		File[] files=file.listFiles();
		
		for(File f:files)
		{
			System.out.println(f);
		}

	}

}
