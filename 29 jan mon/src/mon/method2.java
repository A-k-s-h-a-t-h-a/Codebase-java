package mon;

public class method2 {
	public static void main(String[] args) {
		
		System.out.println(isEven(6));
		
		String result= isEven(7);
		System.out.println(result);
	}
	
	private static String isEven(int num){
		
		String str;
		
		if(num%2==0)
			str = num + " is even";
		
		else
			str= num + " is odd";
		
		return str;
	}
}
