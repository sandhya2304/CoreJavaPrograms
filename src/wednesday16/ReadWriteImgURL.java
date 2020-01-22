package wednesday16;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ReadWriteImgURL
{
	public static void main(String[] args)
	{
		URL url = null;
		BufferedImage img = null;
		
        try
        {
        	url = new URL("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/winter-flowers-crocus-1577990791.jpg?crop=1.00xw:0.752xh;0,0.0553xh&resize=980:*");
        }catch(MalformedURLException e)
        {
        	e.getMessage();
        }
        
        
        try
        {
        	img =ImageIO.read(url);
        	ImageIO.write(img, "png",new File("flower.png"));
        	System.out.println("done");
        }catch(Exception e)
        {
        	e.printStackTrace();
        }
		
	}

}
