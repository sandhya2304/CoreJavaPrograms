package Tuesday4;

public class Java8Lambda
{
	public static void main(String[] args)
	{
		int width = 10;
		
		Drawable d = new Drawable() {
			
			@Override
			public void draw() {
				System.out.println("hello... "+width);
			}
		};
		d.draw();
		
		Drawable d2 =() ->{
			System.out.println("draw..."+width);
		};
		d2.draw();
		
		say s =(naam) ->{
			return "hello,"+naam;
		};
		System.out.println(s.say("sandhya"));
		
		time t =(a,b)->{
			return  a+b; 
		};
		System.out.println(t.add(2, 3));
		
		print p =(a) ->System.out.println("mmm");
		p.printing("aa");
		
	}
}

interface Drawable
{
	public  void draw();	
}
interface say
{
	public String say(String s);	
}
interface time{
	public int add(int a,int b);	
}
interface print
{
	public void printing(String p);
}



