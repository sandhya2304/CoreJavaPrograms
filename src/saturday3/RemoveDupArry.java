package saturday3;

import java.util.LinkedHashSet;

public class RemoveDupArry {

	public static void main(String[] args) {
		
		duplicates(new int[] {1,2,3,4,4,4,5});
	}
	
	public static void duplicates(int[] arry)
	{
LinkedHashSet<Integer> set =new LinkedHashSet<Integer>();
		
		for(int i=0;i<arry.length;i++)
		{
			set.add(arry[i]);
		}
		
		System.out.println(set);
	}
}
