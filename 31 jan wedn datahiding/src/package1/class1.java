package package1;

public class class1 {

	private void privateMethod()
	{
		System.out.println("This is private method");
	}
	
	public void publicMethod()
	{
		privateMethod();
		System.out.println("This is public method");
	}
	
	protected void protectedMethod()
	{
		System.out.println("This is protected method");
	}
	
	void defaultMethod()
	{
		System.out.println("This is default method");
	}
	
	public void someOtherMethod(){
		System.out.println("And another method");
	}
	
	public static void main(String[] args) {
		class1 c= new class1();
		c.privateMethod();
	}
}

