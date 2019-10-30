package Tuesday4;

public class Java8Thread
{
	public static void main(String[] args)
	{
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
			System.out.println("thread running..");
				
			}
		};
		Thread t1 = new Thread(r1);
		t1.run();
		
		
		Runnable r2 = () ->{
			System.out.println("thread 2 run...");
		};
		
		Thread t2 = new Thread(r2);
		t2.run();
	}

}
