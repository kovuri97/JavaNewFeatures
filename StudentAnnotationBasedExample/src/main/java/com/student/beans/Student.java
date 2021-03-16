package com.student.beans;

public class Student {
	private String name;
	private int rollnum;
	private String city;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollnum=" + rollnum + ", city=" + city + "]";
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
