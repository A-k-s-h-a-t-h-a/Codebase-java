package exceptionhandle;

public class exceptionhandledemo {

	public int divide(int x, int y)
	{
		try
		{
		return x/y;
		} catch(ArithmeticException /*Exception*/ ex){
			System.out.println("Pls provide valid values");
			return 0;
		}
	}
	
	public void display(int A[])
	{
		try{
		System.out.println(A[3]);
		} catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("This location doesn't exist");
		}
	}
	
	public static void main(String[] args)
	{
		exceptionhandledemo demo= new exceptionhandledemo();
		demo.divide(10, 0);
	}
}
