package com.test.javaprog;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {
		
		// 1. Add
		// 2. Search
		// 3. Naviagation --> For loop, while, foreach, forEach
		// 4. Remove
		// 5. Update the specified element
		
		ArrayList<Student> stdList = new ArrayList<Student>();
		Student std1 = new Student("abc", "350", 60);
		std1.setStdName("pqr");
		std1.setRollNum("200");
		std1.setMarks(60);
		stdList.add(std1);
		stdList.add(new Student("xyz", "420", 70));
		// Navigate the student list and print the marks of the student with name xyz
		
		for( Student std : stdList) {
			System.out.println("obj = "+std);
			/*
			 * System.out.println("student name= "+std.getStdName());
			 * System.out.println("student name= "+std.getRollNum());
			 * System.out.println("student name= "+std.getMarks());
			 */
		}
		
		
		ArrayList<String> listStr = new ArrayList<String>();
		listStr.add("one");
		listStr.add("two");
		listStr.add("three");
		listStr.add("four");
		
		System.out.println("list = "+listStr);
		
		String str = "four";
		listStr.contains(str);
		
		for(int i=0;i<listStr.size();i++) {
			//String ele = listStr.get(i);
			//boolean flag = ele.equals(str);
			
			//if ( flag ) {
			if ( listStr.get(i).equals(str)) {
				System.out.println("element found");
			}else {
				System.out.println("Element not found");
			}
		}
		
		
		
		
		//List<String> listStr = new ArrayList<String>();
		
	

	}

}
