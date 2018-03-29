package interfaces;

public class DepositAccountNew {
	public void openAccount()
	{
		System.out.println("Deposit Account is opened");
	}
	
	public void closeAccount()
	{
		System.out.println("Deposit Account is closed");
	}
	
	public void withdraw(int amount)
	{
		System.out.println(amount+"Withdaw from deposit account");
	}
	
	public void deposit(int amount)
	{
		
		System.out.println(amount+"Amount deposited in deposit account");
	}
}
