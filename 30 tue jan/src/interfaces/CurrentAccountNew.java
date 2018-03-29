package interfaces;

public class CurrentAccountNew implements Account{

	public void openAccount()
		{
			System.out.println("Account is opened");
		}
		
		public void closeAccount()
		{
			System.out.println("Account is closed");
		}
		
		public void withdraw(int amount)
		{
			System.out.println("Withdaw method");
		}
		
		public void deposit(int amount)
		{
			System.out.println(amount+"Withdaw method");
		}
}
