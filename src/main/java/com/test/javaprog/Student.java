package com.test.javaprog;

public class Student {
	
	String stdName;
	String rollNum;
	int marks;
	
	Student(String name, String num, int mark){
		stdName = name;
		rollNum = num;
		marks = mark;
	}
	
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getRollNum() {
		return rollNum;
	}
	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", rollNum=" + rollNum + ", marks=" + marks + "]";
	}
	
	

}
