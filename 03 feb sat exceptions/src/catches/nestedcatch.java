package catches;

public class nestedcatch {

	public static void main(String[] s) {
//		System.out.println(s[0]); //run using command line i.e. run configurations, arguments, program arguments
//		System.out.println(s[1]);
//		System.out.println(s[2]);
//		System.out.println(s[3]);
		
		//String s[]= {"10"} on passing only one value, gives array index out of bound exception
		//String s[]= {"10", 0} gives arithmetic exception or infinity
		//String s[]= {"10", a} gives number format exception
		
		//Float result =0f;
		try{
		Integer result= Integer.parseInt(s[0])/Integer.parseInt(s[1]);
		//Float result= Float.parseFloat(s[0])/Float.parseFloat(s[1]);
		System.out.println(result);
		}
		catch(NumberFormatException e)									//nested catch though not within one another
		{
			System.out.println("Please give valid input");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please give two input");
		}
		catch(ArithmeticException e)
		{
			System.out.println("The second value should not be zero");
		}
	}
}
