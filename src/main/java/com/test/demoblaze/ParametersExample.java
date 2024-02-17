package com.test.demoblaze;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class ParametersExample {
	
	
	@BeforeClass
	@Parameters({"browser","url"})
	public void Setup()
	{
		
	}

}
