package examQns;

public class Factorial {

	static int fact(int f)
	{
		int output;
		if (f==1)
			return 1;
		output= f*fact(f-1);
		return output;
	}
	
	public static void main(String[] args) {
		int ans= fact(7);
		System.out.println("The factorial of 7 is "+ ans);
		
		int n=9, c, t=1;
		if (n<0)
			System.out.println("Invalid no");
		else
		{
			for (c=0; c<=n; c++)
			{
				t=t*c;
			}
			System.out.println(t);
		}
	}
}
