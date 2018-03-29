package datahiding;

public class employee {
	
	private int id;
	private String name;
	private int salary;
	private char gender;
	
	public void getId() {
		System.out.println(id);
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
		if(salary<10000)
		{
			salary=10000;
		}
		this.salary = salary;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		if (gender=='M' || gender=='F'){
		this.gender = gender;
		}
		else
			System.out.println(("Invalid gender.. please provide valid gender"));
	}
}
