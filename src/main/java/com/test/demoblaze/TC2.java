package com.test.demoblaze;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 {

	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This is before class2");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("This is after class2");
	}
	
	@BeforeMethod
	public void beforemethod()
	
	{
		System.out.println("This is Before method2");
	}
	
	@AfterMethod
	public void aftermethod()
	
	{
		System.out.println("This is After method2");
	}
	@Test
	public void test3()
	{
		System.out.println("This is Test 3");
	}
    @Test
    public void test2()
    {
    	System.out.println("This is Test 4");
    }
}
