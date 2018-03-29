package multithread;

public class mythreadtest {

	public static void main(String[] args) {
		mythread t1= new mythread();
		t1.start(); //if u call run method it won't become thread
					//main thread and t1- will work in parallel
					//to test give diff methods to both threads
		for (int i=100; i<=200; i++)
		{
			System.out.println("User defined thread"+i);
		}
	}
}
