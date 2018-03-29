package practice;

public class Four {

	public static void main(String[] ar) {
		add(10, 20);
		add(10, 20, 60);
	}

	public static void add(int x, int y) {
		System.out.println(x + y);
	}

	public static void add(int x, int y, int z) {
		System.out.println(x + y + z);
	}

}
