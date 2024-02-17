package com.test.demoblaze;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class JavaFakerClass {
	@Test
	 static void fakermethoddefault()
	{
	Faker fake=new Faker();
	String uname=fake.name().username();
	String upass=fake.internet().password();
	System.out.println("User name is ="+uname);
	System.out.println("Password is="+upass);
	}
	public void fakermethodpublic()
	{
	Faker fake=new Faker();
	String uname=fake.name().username();
	String upass=fake.internet().password();
	System.out.println("User name is ="+uname);
	System.out.println("Password is="+upass);
	}
	
}
