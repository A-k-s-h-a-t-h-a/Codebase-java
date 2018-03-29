package mon;

public class switches {
	
	public static void main(String[] args) {
	
		char grade ='B';
		
		switch (grade){
		
		case 'A':
			System.out.println("Grade A. Excellent");
			break;
			
		case 'B':
			System.out.println("b. well done");
			break;
			
		case 'C':
			System.out.println("c. passed");
			break;
			
		case 'f':
			System.out.println("failed");
			break;
			
		default:
			System.out.println("Invalid grade entered");
		}
		
	}

}
