package mylist;

import java.util.List;
import java.util.ArrayList;

public class checklist {
	public boolean exist(List<workers> check, int id) //this is an independent method and is only to check if the worker is in the list or not
	{
		for (workers value:check)
		{
			if (value.getId()==id)
				return true;
		}
		return false;
	}
	
	public List<workers> register()
	{
		List<workers> contract= new ArrayList<workers>();
		workers values;
		
		values= new workers(29, "Watson", 27000);
		contract.add(values);
		
		values= new workers(78, "Poirot", 18600);
		contract.add(values);
		
		values= new workers(62, "Sherlock", 21900);
		contract.add(values);
		
		values= new workers(30, "Langdon", 17300);
		contract.add(values);
		
		return contract;
	}
	
	public void display(List<workers> element)
	{
		for (workers valued:element)
		{
			System.out.println(valued.getId());
			System.out.println(valued.getName());
			System.out.println(valued.getSalary());
		}
	}
	
	public static void main(String[] args) {
		checklist rounds= new checklist();
		List<workers> cheque= rounds.register();
		rounds.display(cheque);
	}
}
