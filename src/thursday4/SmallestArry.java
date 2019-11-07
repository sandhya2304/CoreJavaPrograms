package thursday4;

public class SmallestArry {

	public static void main(String[] args) {
	int arry[] = {1,4,5,6,9};
		
		int min = arry[0];
		for(int i=0;i<arry.length;i++)
		{
			if(arry[i] < min)
				min = arry[i];
		}
		
		
	}

}
