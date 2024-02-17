package com.blaze.pojo;

public class UserInfo {
	
	private String name;
	private String add;
	private String location;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", add=" + add + ", location=" + location + ", gender=" + gender + "]";
	}
	
}
