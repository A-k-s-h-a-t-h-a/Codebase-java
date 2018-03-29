package arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int A[]= {10, 20, 30};
		int B[];
		
		B=A;
		B[0]= 100;
		
		for(int i=0; i<3; i++)
		{
			System.out.println(B[i]);
			System.out.println(A[i]);
		}
	}
}
