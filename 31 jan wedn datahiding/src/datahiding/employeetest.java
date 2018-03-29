package datahiding;

public class employeetest {

	public static void main(String[] args) {
		
		employee emp= new employee(); //no direct access, but through public method, access to the data
		employee emp1= new employee();
		
		emp.setId(101);
		emp.setName("Amit");
		emp.setSalary(-200000);
		emp.setGender('-');
		
		emp1.setId(102);
		emp1.setName("Sreesanth");
		emp1.setSalary(10000);
		emp1.setGender('M');
		
		emp.getId();
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getGender());
		
		emp1.getId();
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());
		System.out.println(emp1.getGender());
	}
}