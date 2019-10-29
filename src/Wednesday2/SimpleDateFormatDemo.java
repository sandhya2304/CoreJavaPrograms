package Wednesday2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) 
	{
		Date today = new Date();
		
		System.out.println("date is :"+today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("here"+sdf.format(today));

	}

}
