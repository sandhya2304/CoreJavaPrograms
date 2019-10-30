package Tuesday4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResorceFilejava7 {

	public static void main(String[] args) throws IOException
	{
		FileOutputStream fo =new FileOutputStream(new File("D:\\java.txt"));
	    String greeting ="hello sandhya";
	    
	    byte[] b =greeting.getBytes();
	    
	    fo.write(b);
	    
	    System.out.println("done---");
	    fo.close();

	}

}
