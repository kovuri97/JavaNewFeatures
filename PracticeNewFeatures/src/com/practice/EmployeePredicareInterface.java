package com.practice;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeePredicareInterface {
		String name;
		int age;
		double salary;
		String location;
		
		public EmployeePredicareInterface(String name, int age, double salary, String location) {
			this.name = name;
			this.age = age;
			this.salary = salary;
			this.location = location;
		}
		
		public void method1() {
			Predicate<String> p = value->value.length()>5;
			String array[] = {"arun","lavanya","aruna","srinivasulu"};
			for(String value : array) {
				if(p.test(value)) {
					System.out.println("String "+value+" length is greater than 5");
				}
				else {
					System.out.println("String "+value+" length is less than 5");
					
				}
			}
		}
}

class Employee1{
	public void method() {
		int count = 0;
		Predicate<EmployeePredicareInterface> p = (value)->value.salary>30000&&value.location.equals("mumbai");
		List<EmployeePredicareInterface> arrayList = new ArrayList<EmployeePredicareInterface>();
		arrayList.add(new EmployeePredicareInterface("Anu",20,20000,"mumbai"));
		arrayList.add(new EmployeePredicareInterface("Jho",25,30000,"hyderabad"));
		arrayList.add(new EmployeePredicareInterface("Kish",28,40000,"mumbai"));
		arrayList.add(new EmployeePredicareInterface("Nikki",22,40000,"mumbai"));
		for(EmployeePredicareInterface employee : arrayList) {
			if(p.test(employee)) {
				System.out.println("Employess details whose age is greater than 20 and location mumbai is: "+employee.name);
				count++;
			}
		}
		System.out.println("Employess count whose age is greater than 20 and location mumbai is: "+count);
	}
}
