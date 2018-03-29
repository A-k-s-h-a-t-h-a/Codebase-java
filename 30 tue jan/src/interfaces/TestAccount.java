package interfaces;

public class TestAccount {
	public static void main(String[] args){
	
	Account da= new DepositAccount();
	CurrentAccount ca= new CurrentAccount();
	
	da.openAccount();
	da.deposit(2000);
	da.withdraw(1000);
	da.closeAccount();
	
	ca.openAccount();
	ca.withdraw();
	ca.closeAccount();
	ca.getBalance();
	}
}
