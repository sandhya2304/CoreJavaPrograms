package wednesday16;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ReadAndWriteImg 
{
	public static void main(String[] args)
	{
		
		File file = new File("D://img.jpg");
		BufferedImage img = null;
		
		try
		{
			img = ImageIO.read(file);
			ImageIO.write(img,"jpg",new File("sandhya.jpg"));
			ImageIO.write(img,"png",new File("sharma.png"));
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
