package bankingsync;

public class account {

	int balance;
	public account(int balance)
	{
		this.balance= balance;
	}
	
	public void withdraw(int amt)
	{
		balance= balance - amt;
		System.out.println("Ater withdrawing an amt of"+ amt+ "the balance is"+ balance);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void deposit(int amt) //if not synchronized,you get garbage output
	{
		balance= balance + amt;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ater depositing an amt of"+ amt+ "the balance is"+ balance);
		
	}
}
