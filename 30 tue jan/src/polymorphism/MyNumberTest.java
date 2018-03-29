package polymorphism;

public class MyNumberTest {
	public static void main(String[] args){
		MyNumber n = new MyNumber();
		System.out.println(n.add(10, 20));
	}
}

class MyNumber{
	int add(int x, int y){
		return x+y;
	}
	
	int add (int x, int y, int z){
		return x+y+z;
	}
}