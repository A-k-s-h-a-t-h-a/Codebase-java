package multithread;

public class myrunnablethreadtest {

	public static void main(String[] args) {
//		myrunnablethread rthread= new myrunnablethread();
//		Thread t1= new Thread(rthread);
		
		//create thread instance and pass rthread
		Thread t1= new Thread(new myrunnablethread());
		t1.start();
		
//		int table= 7;
//		for (int i=1; i<=10; i++)
//		{
//			System.out.println(table+ "*"+ i+ "="+ table*i);
//		}
		
		int f=1;
		for(int i=1; i<=8; i++)
		{
			f= f*1;
		}
		System.out.println("factorial of 8 is "+f);
	}
}
