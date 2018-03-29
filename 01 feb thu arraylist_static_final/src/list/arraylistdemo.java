package list; //list of integers, list of strings

import java.util.List;
import java.util.ArrayList;

public class arraylistdemo {
	
	public void displayList(List<Integer> l)
	{
		//int, float, double, char, long- primitive data type
		//for each primitive datatype, there are wrapper classes that must be used
		for(Integer val: l)
		{
			System.out.println(val);
		}
	}

	public void displayList1(List<String> s)
	{
		for(String val: s)
		{
			System.out.println(val);
		}
	}
	
		public static void main(String[] args) {
			//1 create instance of arraylist
			//2 add n no of integer values
			
			List<String> myList1= new ArrayList();
			
			myList1.add("Delhi");
			myList1.add("Jaipur");
			myList1.add("Agra");
			myList1.add("Ooty");
			myList1.add("Hoogli");

			
			List<Integer> myList= new ArrayList();
			
			myList.add(10);
			myList.add(20);
			myList.add(30);
			myList.add(40);
			myList.add(50);
			
			myList.add(500);// modified after creation
			myList.add(150);// ""
			
			myList.add(2,200); //specifies position where you want to add
			
			arraylistdemo demo= new arraylistdemo();
			
			demo.displayList(myList);
			demo.displayList1(myList1);
			
			}
}
