package practice;

public class Three {

	public static void main(String[] args) {
		String grade= "Good";
		
		switch(grade){
		case "excellent": 
			System.out.println("grade A");
			break;
		case "well done":
			System.err.println("grade B");
			break;
		case "good":
			System.out.println("grade C");
			break;
		case "average":
			System.out.println("grade D");
		default:
			System.out.println("Any other words will fail you");
		}
	}
}
