package com.niit.junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitDemoTestCase {

	private static JUnitDemo junitDemo;
	
	@BeforeClass
	public static void init()
	{
		System.out.println("creating instance junitDemo");
		junitDemo= new JUnitDemo();
	}
	
	@AfterClass
	public static void close()
	{
		junitDemo= null;
	}
	
	@Test
	public void addTestCase()
	{
		int result= junitDemo.add(10, 20);
		//compare the expected(30) result with actual(result)
		assertEquals("add test case", 30, result);
	}
	
	@Test
	public void compareTestCase()
	{
		int big= junitDemo.big(10, 20);
		assertEquals("big test case", 20, big);
	}
}
