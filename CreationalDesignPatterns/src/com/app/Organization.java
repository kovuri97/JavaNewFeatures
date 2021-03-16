package com.app;

import java.util.Scanner;

public class Organization  extends Employee implements TargetInterface{
	Scanner s = new Scanner(System.in);
	@Override
	public void getOrganizationEmployees() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("enter employee name");
		String name = s.nextLine();
		System.out.println("enter employee address");
		String address = s.nextLine();
		System.out.println("enter employee salary");
		double salary = s.nextDouble();
		setEmname(name);
		setEmaddress(address);
		setSalary(salary);
		
	}

	@Override
	public String getEmployeeDetails() {
		// TODO Auto-generated method stub
		return "Employee name: "+getEmname()+" Employee address: "+getEmaddress()+" Employee salary: "+getSalary();
		
	}

}
