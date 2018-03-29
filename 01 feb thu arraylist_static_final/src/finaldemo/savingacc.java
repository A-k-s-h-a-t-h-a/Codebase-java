package finaldemo;

public class savingacc extends acc {
	public int getBalance() //if final is used in the superclass, this method cannot be overridden
	{
		return 200;
	}
	
	public static void main(String[] args) {
		savingacc sa= new savingacc();
		System.out.println(sa.getBalance());
	}
}
