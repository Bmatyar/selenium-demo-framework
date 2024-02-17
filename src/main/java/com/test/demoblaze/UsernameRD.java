package com.test.demoblaze;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class UsernameRD {
	//@Test
	 public static void undefault()
	{
	Faker fake=new Faker();
	String uname=fake.name().username();
	System.out.println("User name is ="+uname);
	
	}
	protected void pwdpublic()
	{
	Faker fake=new Faker();
	String upass=fake.internet().password();
	System.out.println("Password is="+upass);
	}
}
