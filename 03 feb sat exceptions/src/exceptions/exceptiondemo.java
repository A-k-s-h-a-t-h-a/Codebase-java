package exceptions;

public class exceptiondemo {

	public float divide(int x, int y)
	{
		return x/y; //arithmetic exception
	}
	
	public void display(int A[])									//needs to be overloaded for String
	{
		System.out.println(A[1]); //ArrayIndexOutOfBoundsException
		System.out.println(A[10]); // This index not available
	}
	
	public void display(String A[])
	{
		System.out.println(A[1]); //ArrayIndexOutOfBoundsException
		System.out.println(A[4]); 
	}
	
	public static void main(String[] args) {
		exceptiondemo ex = new exceptiondemo();
		
		//System.out.println(ex.divide(20, 4));
		//System.out.println(ex.divide(20, 0)); //doesn't make sense, so throws errors
		
		//int A[]={10,20,30,40,60};
		//ex.display(A);
		
		//String name[]= {"Ravi", "Namit", "Dinesh", "Prateek"};
		//ex.display(name);
		
		//employee a= new employee();
		employee a= null;					// on null object, you cannot call any method
		a.setId(101);
	}
}
