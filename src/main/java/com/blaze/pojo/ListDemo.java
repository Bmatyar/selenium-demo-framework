package com.blaze.pojo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> strNames = new ArrayList<String>();
		WebDriver driver = new ChromeDriver();
		
		strNames.add("test");
		//strNames.add(23);
		

	}

}
