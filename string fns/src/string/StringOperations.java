package string;

import java.util.Date;

public class StringOperations {

	public static void main(String[] args) {
/*		String s1= "Hello"; //first searches if hello is present in heap memory, if yes doesn't create new object
		String s2= "Hello"; //creates new object
		
		if(s1==s2)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("No");
		}*/
		
/*		String s1= new String("Hello");
		String s2= new String("Hello");
		
		if(s1.equals(s2))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("No");
		}*/
		
/*		Employee e1= new Employee(101, "Yogender");
		Student s1= new Student(101, "Yogender");*/
		
		String s= new String("Hello");
		long startTime= System.currentTimeMillis(); //get time
		Date d= new Date(startTime);
		System.out.println(d);
		for(int i=1; i<=1000; i++)
		{
			s= s+ "Hai";
		}
		long endTime= System.currentTimeMillis();
		d= new Date(endTime);
		System.out.println(d);
		System.out.println("Time taken for String: "+ (endTime-startTime));
		//get time
		//subtract
													//StringBuffer
		StringBuffer sb= new StringBuffer("Hello");
		for(int i=1; i<=1000; i++)
		{
			sb.append("Hai");
		}
		endTime= System.currentTimeMillis();
		System.out.println("Time taken for StringBuffer: "+ (endTime-startTime));
	}
}
