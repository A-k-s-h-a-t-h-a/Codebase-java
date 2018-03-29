package finallydemo;

import exceptions.employee;

public class exceptionfinallydemo {

	public void display ()
	{
		employee emp1;
		employee emp2 = null;
		try {
			emp1 = new employee();
			
			emp1.setId(101);
			emp1.setName("Yogender");
			emp1.setSalary(20000);
			
			System.out.println(emp1.getName());
			System.out.println(emp2.getId());
			System.out.println(emp1.getSalary());
		} catch (NullPointerException e) {
			System.out.println("Employee does not exist");;
		}
		finally{
			System.out.println("emp1 will be set to null");
			emp1= null;
		}
	}
	
	public static void main(String[] args) {
		exceptionfinallydemo demo= new exceptionfinallydemo();
		demo.display();
	}
}
