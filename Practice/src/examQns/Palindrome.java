package examQns;

public class Palindrome {

	public static void main(String[] args) {
		int s=0, r, n=989, t= n;
		while (n>0)
		{
			r= n%10;
			s=s*10+ r;
			n=n/10;
		}
		if (t==s)
			System.out.println("Palindrome");
		else
			System.out.println("Not");
	}
}
