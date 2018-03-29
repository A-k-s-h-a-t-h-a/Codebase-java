package multithread;

public class myrunnablethread implements Runnable{

	@Override
	public void run() {
//		int table= 6;
//		for (int i=1; i<=10; i++)
//		{
//			System.out.println(table+ "*"+ i+ "="+ table*i);
//		}
		
		int f=1;
		for(int i=1; i<=6; i++)
		{
			f= f*1;
		}
		System.out.println("factorial of 6 is "+f);
	}

	
}
