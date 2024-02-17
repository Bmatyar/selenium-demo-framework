package com.cantrust.demoblaze.utils;

import com.github.javafaker.Faker;

public class DataUtils {
	
	public static Faker fake=new Faker();
	
	public static String getRandomUserName() {
		return fake.name().username();
	}
	
	public static String getRandomPassword() {
		return fake.internet().password();
	}

}
