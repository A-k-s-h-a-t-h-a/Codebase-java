package examQns;

import java.util.Scanner;

public class LargestOfThree {
	
	public static void main(String[] args) {
		
		int[] numerals= {88, 93, 21, 70};
		int largest= numerals[0];
		int smallest= numerals[0];
		for(int i=0; i<numerals.length; i++)
		{
			if (numerals[i]> largest)
				largest= numerals[i];
			if (numerals[i]< smallest)
				smallest= numerals[i];
		}
		System.out.println("Largest no is "+ largest);
		System.out.println("Smallest no is "+ smallest);
		
		
		int x, y, z;
		System.out.println("Enter 3 nos");
		Scanner no= new Scanner(System.in);
		x= no.nextInt();
		y= no.nextInt();
		z= no.nextInt();
		
		if (x>y && x>z)
			System.out.println(x+ " is greater");
		else if (y>x && y>z)
			System.out.println(y+ " is greater");
		else
			System.out.println(z+ " is greater");

	}
}
