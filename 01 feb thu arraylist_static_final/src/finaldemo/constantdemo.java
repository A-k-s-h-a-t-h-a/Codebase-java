package finaldemo;

public class constantdemo {
	private /*final*/ float pi= 3.1415f;
	
	public final int getSum(int x, int y)
	{
		return x+y;
	}
	
	public final int getSum(int x,int y, int z)
	{
		return x+y+z;
	}
	
	public static void main(String[] args) {
		constantdemo c= new constantdemo();
		c.pi= c.pi+ 10; //final: since already assigned, cannot give another value
		System.out.println(c.pi);
	}
}
