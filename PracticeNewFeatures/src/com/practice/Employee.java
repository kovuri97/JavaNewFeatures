package com.practice;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee {
		String name;
		Double salary;
		String city;
		
		public Employee(String name, Double salary, String city) {
			this.name = name;
			this.salary = salary;
			this.city = city;
		}



}

class EmployeeDemo{
	public void method() {
		List<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee("Anu",20000.0,"mumbai"));
		arrayList.add(new Employee("Jho",30000.0,"hyderabad"));
		arrayList.add(new Employee("Nikki",40000.0,"delhi"));
		arrayList.add(new Employee("Kish",50000.0,"karnool"));
		List<Employee> resultList = arrayList.stream().sorted((s1,s2)->-(String.valueOf(s1.salary)).compareTo(String.valueOf(s2.salary))).collect(Collectors.toList());
		System.out.println("Employees details in decending order based on salary: ");
		resultList.forEach(i->{System.out.println(i.name+" "+i.salary+" "+i.city);});
		
		Employee maxValue = arrayList.stream().max((s1,s2)->(String.valueOf(s1.salary)).compareTo(String.valueOf(s2.salary))).get();
		System.out.println("max value of result list: "+maxValue.salary);
		
		Employee minValue = arrayList.stream().min((s1,s2)->(String.valueOf(s1.salary)).compareTo(String.valueOf(s2.salary))).get();
		System.out.println("min value of result list: "+minValue.salary);
		
		List uppercase = arrayList.stream().map(s1->s1.name.toUpperCase()).collect(Collectors.toList());
		System.out.println("Employees details with uppercase "+uppercase);
		
	}
}
