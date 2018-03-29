package exceptions;

public class Account {

	private int balance= 10000;
										//specify from where this method is called & handle the exception i.e. use catch
	public void withdraw(int amount) throws MinimumBalanceException //specifies which exception this method may throw
	{
		balance= balance- amount;
		if(balance< 1000)
		{											//throws new exception
			throw new MinimumBalanceException(); 
		}
	}
}
