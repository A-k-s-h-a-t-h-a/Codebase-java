package interfaces;

public class DepositAccount implements Account {
	
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
		System.out.println(amount+" Withdawn from deposit account");
	}
	
	public void deposit(int amount)
	{
		System.out.println(amount+" deposited in deposit account");
	}
}
