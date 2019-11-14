package tuesday6;

import java.time.format.TextStyle;

public class EnumString 
{
	public static void main(String[] args)
	{
		String style = "sandhya";
		
		//TextStyle ts = TextStyle.valueOf(style.toUpperCase());
		naam m = naam.valueOf(style.toUpperCase());
		System.out.println(m);

	}
	
	enum naam
	{
		SANDHYA,mona,harsh,sona;
	}

}
