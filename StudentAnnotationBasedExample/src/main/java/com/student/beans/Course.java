package com.student.beans;

public class Course {
	private String name;
	private int courseid;
	
	
	@Override
	public String toString() {
		return "Course [name=" + this.name + ", courseid=" + this.courseid + "]";
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}
}
