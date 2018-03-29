package map;

import java.util.HashMap;
import java.util.Map;

import NewList.empl;

public class employeemap {

	
	
	
	public static void main(String[] args){
		empl emp;
		Map<Integer, empl> empMap= new HashMap<>();
	
	emp= new empl(101, "Rupsa", 1000);
	empMap.put(101, emp);
	
	emp= new empl(102, "Koffi", 2000);
	empMap.put(102, emp);
	
	emp= new empl(103, "Lakshmi", 4000);
	empMap.put(103, emp);
	
	emp= new empl(104, "Manoj", 6000);
	empMap.put(104, emp);
	
	if (empMap.get(101)==null)
		System.out.println("emp does not exist");
	else
		System.out.println("emp exists");
	}
}
