package examQns;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		String prime= "";
		for (int i=1; i<=100; i++)
		{
			int ctr=0;
			for(int num=i; num>=1; num--)
			{
				if(i%num==0)
					ctr= ctr+1;
			}
			if (ctr==2)
				prime= prime+ i+ " ";
		}
		System.out.println("The prime nos are "+ prime);

		
	int n;
	System.out.println("Enter no you want to check");
	Scanner no= new Scanner(System.in);
	n= no.nextInt();
	
	if (n%2==0)
		System.out.println("not prime");
	else
		System.out.println("prime");
	
	}
}
