package catches;

public class multicatch {

	public static void main(String[] s) {

		Integer result=0;
		
		try{
		result= Integer.parseInt(s[0])/Integer.parseInt(s[1]); //if exception in this line, next won't print; directly goes to catch
		System.out.println(result);
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException| ArithmeticException e) //multi catch
		{
			System.out.println("Please give valid input");
			e.printStackTrace(); //to print complete stack trace
		}	
		
		System.out.println("End of the program");
		
	}
}
