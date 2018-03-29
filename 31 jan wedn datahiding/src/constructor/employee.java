package constructor;

public class employee {
	//contact no, PAN
	private int id;
	private String name;
	private int salary;
	//private String mailID;
	
	//no parameterized constructor
	public employee(int id, String name, int salary)/*, String mailID*/
	{ 
		System.out.println(this.id=id);
		System.out.println(this.name=name);
		System.out.println(this.salary=salary);
		//this.mailID=mailID;
	}
}
