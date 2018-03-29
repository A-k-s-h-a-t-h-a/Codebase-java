package mylist;

public class workers {

	private int id;
	private String name;
	private int salary;
	
	public workers(int NO, String CALLED, int PAY)
	{
		this.id= NO;
		this.name= CALLED;
		this.salary= PAY;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
