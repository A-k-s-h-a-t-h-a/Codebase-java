package interfaces;

public interface Account {
	
	void openAccount();
	void closeAccount();
	void withdraw(int amount);
	void deposit(int amount);
}
