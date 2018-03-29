package mon;

public class methods {
	public static void main(String[] args) {
		
		isEven(9);
		isEven(16);
		isEven(87);
		isEven(22);
	}
	
	private static void isEven(int num){
	
		if(num%2==0)
			System.out.println(num+ " is even");
		
		else
			System.out.println(num+" is odd");
	}

}
