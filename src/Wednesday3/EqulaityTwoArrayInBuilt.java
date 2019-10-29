package Wednesday3;

import java.util.Arrays;

public class EqulaityTwoArrayInBuilt
{
	public static void main(String[] args)
	{
		
		String[] s1 = {"sandhya","hum","sharma"};
		String[] s2 = {"sandhya","sharma","hum"};

		
		System.out.println(Arrays.equals(s1,s2));//true
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		System.out.println(Arrays.equals(s1, s2));
		
	}

}
