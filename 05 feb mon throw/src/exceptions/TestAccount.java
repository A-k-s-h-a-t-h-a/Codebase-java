package exceptions;

public class TestAccount {

	public static void main(String[] args) {
		Account ac= new Account();
		try {
			ac.withdraw(1000);
		} catch (MinimumBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Your transaction is successful");
	}
}
