package multithread;

public class mythread extends Thread{

	public void run()
	{
		//System.out.println("Inside run method");
		for (int i=100; i<=200; i++)
		{
			System.out.println("Main thread"+i);
		}
	}
}
