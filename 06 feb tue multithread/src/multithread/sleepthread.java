package multithread;

public class sleepthread extends Thread{

	public void run()
	{
		int t=5;
		for (int i=1; i<=10; i++)
		{
		 System.out.println(t+ "*"+ i+ "="+ t*i);
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
