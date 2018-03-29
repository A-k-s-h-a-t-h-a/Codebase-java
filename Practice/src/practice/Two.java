package practice;

public class Two {

	int age;
	String colour;
	String breed;
	
	public static void bad(String b){
		System.out.println(b);
	}
	public static void cold(String c){
		System.out.println(c);
	}
	public static void ago(int a){
		System.out.println(a);
	}
	
	public static void main(String g[]){
		bad("german shepherd");
		cold("beige");
		ago(7);
	}
}
