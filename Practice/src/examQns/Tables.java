package examQns;
import java.util.Scanner;
public class Tables {

	public static void main(String[] args) {
		for(int n=1; n<11; n++)
			for(int i=1; i<11; i++)
				System.out.println(n*i);
		
		int num;
		System.out.println("Enter number whose tables you want");
		Scanner no= new Scanner(System.in);
		num= no.nextInt();
		for(int i=1; i<=10; i++)
			System.out.println(num*i);
		
	}
}
