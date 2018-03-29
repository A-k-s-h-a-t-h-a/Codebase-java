package bankingsync;

public class withdrawthread extends Thread{	//withdraw thread and account in the same package so no need to import

	//from which account you have to withdraw and how much amount							//1 variables
	private account Account;
	private int amt; //values can be supplied using setter method or constructor
	
	public withdrawthread(account acc, int amount)											//2 constructor
	{
		this.Account= acc;
		this.amt= amount;
	}
	
	public void run()																		//3 run method
	{
		Account.withdraw(amt);
	}
}
