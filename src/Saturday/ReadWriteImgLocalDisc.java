package Saturday;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ReadWriteImgLocalDisc 
{

	public static void main(String[] args)
	{
		
		File file =new File("D:\\bruno.jpg");
		
		BufferedImage image = null;
		
		try
		{
			image = ImageIO.read(file);
			ImageIO.write(image,"gif",new File("output.gif"));
			ImageIO.write(image,"png",new File("output.png"));
			
			
		}catch(Exception io)
		{
			io.printStackTrace();
		}
System.out.println("done");
	}

}
