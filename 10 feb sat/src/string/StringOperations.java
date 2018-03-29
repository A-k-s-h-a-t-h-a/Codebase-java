package string;

public class StringOperations {

	public static void main(String[] args) {
		String s1= "Hello"; //1st searches if hello is present in heap memory or not
		String s2= new String ("hello");
		
//		System.out.println(s1);
//		System.out.println(s2);
		
		if (s1.equals(s2))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
		
		Employee e1= new Employee(101, "Noorie Ahmed", 30000);
		Employee e2= new Employee(101, "Noorie Ahmed", 30000);
		
		System.out.println(s1);
		System.out.println(e1);
		
		if (e1.equals(e2))
			System.out.println("Both the employees are same");
		else
			System.out.println("Both the employees are different");
		
	}
}
