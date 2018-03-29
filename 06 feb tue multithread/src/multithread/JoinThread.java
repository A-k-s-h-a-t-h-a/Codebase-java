package multithread;

public class JoinThread extends Thread{

	public void run()
	{
		int t=6;
		for (int i = 1; i <=10; i++) {
			System.out.println(i+ "*"+ t+ "="+ t*i);
		}
	}
}
