package package1;

public class class11 {
	
	public void someOtherMethod(){
		class1 c= new class1();
		c.defaultMethod();	
	}
	
	public static void main(String[] args) {
		class1 c= new class1();
		c.publicMethod();
		
		class11 d= new class11();
		d.someOtherMethod();
	}	
}
