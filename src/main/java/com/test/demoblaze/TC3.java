package com.test.demoblaze;

import org.testng.annotations.Test;

public class TC3 {
	
    @Test(groups = {"smoke-test"})
	void test1()
	{
		System.out.println("This is test 1.......");
	}
    
    @Test(groups = {"regression-test"})
	void test2()
	{
		System.out.println("This is test 2.......");
	}
    
    @Test(groups = {"regression-test"})
	void test3()
	{
		System.out.println("This is test 3.......");
	}
    
    @Test(groups = {"smoke-test"})
	void test4()
	{
		System.out.println("This is test 4.......");
	}
    
    @Test(groups = {"regression-test","smoke-test"})
	void test5()
	{
		System.out.println("This is test 5......");
	}
	
	
	
	
	
}
