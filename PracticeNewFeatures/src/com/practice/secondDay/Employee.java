package com.practice.secondDay;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee {
		String name;
		int salary;
		String city;
		
		public Employee(String name, int salary, String city) {
			this.name = name;
			this.salary = salary;
			this.city = city;
		}



}

class EmployeeDemo{
	public void method() {
		List<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee("Anu",20000,"mumbai"));
		arrayList.add(new Employee("Jho",30000,"hyderabad"));
		arrayList.add(new Employee("Kish",40000,"mumbai"));
		arrayList.add(new Employee("Nikki",40000,"mumbai"));
		List resultList = arrayList.stream().sorted((s1,s2)->-(String.valueOf(s1.salary)).compareTo(String.valueOf(s2.salary))).collect(Collectors.toList());
		System.out.println("Employess count whose age is greater than 20 and location mumbai is: "+resultList);
		Employee maxValue = arrayList.stream().max((s1,s2)->(String.valueOf(s1.salary)).compareTo(String.valueOf(s2.salary))).get();
		System.out.println("max value of result list: "+maxValue);
		Employee minValue = arrayList.stream().min((s1,s2)->(String.valueOf(s1.salary)).compareTo(String.valueOf(s2.salary))).get();
		System.out.println("min value of result list: "+minValue);
		List uppercase = arrayList.stream().map(s1->s1.name.toUpperCase()).collect(Collectors.toList());
		System.out.println("Employess details with uppercase "+resultList);
		
	}
}
