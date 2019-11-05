package Tuesday5;

public class ReverseString 
{
	public static void main(String[] args)
	{
		String input = "sandhya";
		 // getBytes() method to convert string  
        // into bytes[]. 
		byte[] strByte = input.getBytes();
		
		
		//Create a new String abject using byte[] to
		// store result.
		byte[] result = new byte[strByte.length];
		
		 // Store result in reverse order into the 
        // result byte[] 
		for(int i=0;i < strByte.length;i++)
		{
			result[i] = strByte[strByte.length-i-1];
	
		}
		System.out.println(new String(result));
		
	}
	
	
}
