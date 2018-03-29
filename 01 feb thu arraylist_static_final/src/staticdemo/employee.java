package staticdemo;

public class employee {
									//will initialize only once- first
	private static int count =0; // static: shareable to all objects
	
	private int id; // if static used for id, will be shared with all employees, so don't use static
	private String name;
	private int salary;
	
	public employee()
	{
		count++;
	}
									// only if getCount is in the same class, it can be called
	public static int getCount() //
	{
		return count;
	}
}