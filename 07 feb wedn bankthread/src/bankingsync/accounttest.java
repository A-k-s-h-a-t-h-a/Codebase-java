package bankingsync;

public class accounttest {

	public static void main(String[] args) {
		account a= new account(10000);
		
		withdrawthread wt= new withdrawthread(a, 2000);
		wt.start();
		
		depositthread dt= new depositthread(a, 3000);
		dt.start();
		
		withdrawthread w1t= new withdrawthread(a, 4000);
		w1t.start();
		
		depositthread d1t= new depositthread(a, 7000);
		d1t.start();
		
		withdrawthread wt2= new withdrawthread(a, 1000);
		wt2.start();
		
		depositthread dt2= new depositthread(a, 6000);
		dt2.start();
		
		withdrawthread wt3= new withdrawthread(a, 9000);
		wt3.start();
		
		depositthread dt3= new depositthread(a, 8000);
		dt3.start();
	}
}
