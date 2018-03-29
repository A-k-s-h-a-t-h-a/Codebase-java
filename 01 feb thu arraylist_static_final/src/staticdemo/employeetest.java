package staticdemo;

public class employeetest {

	public static void main(String[] args) { // to display how many instances (employees) are there ie count
		employee emp1= new employee();
		employee emp2= new employee(); //will reinitialize count for each employee
		employee emp3= new employee();
		employee koffi= new employee();
		employee noorie= new employee();
				
		System.out.println(employee.getCount()); //class name or variable name will do
	}
}
