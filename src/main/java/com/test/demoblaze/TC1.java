package com.test.demoblaze;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This is before class1");
		Assert.assertEquals(false, null);
	}
	
	@BeforeSuite
	public void beforeSuite1() {
		System.out.println("before suite..");
	}
	
	@AfterSuite
	public void afterSuite1() {
		System.out.println("after suite..");
	}
	
	
	@BeforeTest
	public void beforeTest1() {
		System.out.println("before test..");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test..");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("This is after class1");
	}
	
	@BeforeMethod
	public void beforemethod()
	
	{
		System.out.println("This is Before method1");
	}
	
	@AfterMethod
	public void aftermethod()
	
	{
		System.out.println("This is After method1");
	}
	@Test
	public void test1()
	{
		System.out.println("This is Test 1");
	}
    @Test
    public void test2()
    {
    	System.out.println("This is Test 2");
    }
}
