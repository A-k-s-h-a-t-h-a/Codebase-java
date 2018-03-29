package NewList;

import java.util.List;
import java.util.ArrayList;

public class emplist {
	
	//define a method which returns true or false
	//if the emp exists, return true, else false
	
	public boolean /*String*/ exist(List<empl> emplist, int id) //String name)
	{
		for(empl emp: emplist)
		{
			if(emp.getId()==id)									//if (emp.getName().equals(name)) //equals compares each letter of the string
				return true /*Employee exists*/;				//return name+ "Employee exists";
		}
		return false /*Employee doesn't exist*/;				//return name+ "Employee doesn't exist";
	}
	
	public List<empl> createEmployeeList()
	{
		List<empl> employeeList= new ArrayList<empl>();
		empl emp;
		
		emp= new empl(101, "Rupsa", 1000);
		employeeList.add(emp);
		
		emp= new empl(102, "Koffi", 2000);
		employeeList.add(emp);
		
		emp= new empl(103, "Lakshmi", 4000);
		employeeList.add(emp);
		
		emp= new empl(104, "Manoj", 6000);
		employeeList.add(emp);
		
		return employeeList;
	}
	
	public void displayEmployees(List<empl> empList)
	{
		for(empl emp: empList)
		{
			System.out.print("ID:"+emp.getId()+"\t");
			System.out.println("Name:"+emp.getName()+"\t");
			System.out.println("Salary:"+emp.getSalary()+"\t");
		}
	}

	public static void main(String[] args) {
			
		emplist list= new emplist();
		List<empl> emplist= list.createEmployeeList();
		//list.displayEmployees(emplist);
		
	}
}
