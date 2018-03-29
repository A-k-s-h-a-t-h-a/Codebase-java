package interfaces;

public class CurrentAccount extends AbstractAccount{ //if you use implements Account: it will show error since all the methods 
								//declared in the Accounts interface are not implemented
	
	public void openAccount()
	{
		System.out.println("\nCurrent Account is opened");
	}
	
	public void closeAccount()
	{
		System.out.println("Current Account is closed");
	}
	
	public void withdraw()
	{
		System.out.println("Withdaw method of ca");
	}
	
	public void getBalance()
	{
		System.out.println("Get balance from abstract account in ca");
	}
	
}
