package com.app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter laptop name:");
		String name = s.next();
		Factory f = new Factory();
		f.getLaptopName(name);
		TargetInterface targetInterface = new Organization();
		targetInterface.getOrganizationEmployees();
		System.out.println(targetInterface.getEmployeeDetails());
		
	}

}
