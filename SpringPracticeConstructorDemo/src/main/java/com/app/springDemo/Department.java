package com.app.springDemo;

public class Department {
	String dept1,dept2,dept3;

	public Department(String dept1, String dept2, String dept3) {
		super();
		this.dept1 = dept1;
		this.dept2 = dept2;
		this.dept3 = dept3;
	}

	public String getDept1() {
		return dept1;
	}

	public void setDept1(String dept1) {
		this.dept1 = dept1;
	}

	public String getDept2() {
		return dept2;
	}

	public void setDept2(String dept2) {
		this.dept2 = dept2;
	}

	public String getDept3() {
		return dept3;
	}

	public void setDept3(String dept3) {
		this.dept3 = dept3;
	}

	@Override
	public String toString() {
		return "Department [dept1=" + dept1 + ", dept2=" + dept2 + ", dept3=" + dept3 + "]";
	}
}
