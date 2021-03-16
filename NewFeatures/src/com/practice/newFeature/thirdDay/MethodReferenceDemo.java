package com.practice.newFeature.thirdDay;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReferenceDemo {
	
	public static int compare(Employee o1, Employee o2) {
		return (o1.getSalary()).compareTo(o2.getSalary());
	}
	
	public int compareName(Employee o1, Employee o2) {
		return (o1.getName()).compareTo(o2.getName());
	}
	
	public void method1() {
		List<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee("Anu",60000.0,"mumbai"));
		arrayList.add(new Employee("Jho",30000.0,"hyderabad"));
		arrayList.add(new Employee("Nikki",40000.0,"delhi"));
		arrayList.add(new Employee("Kish",50000.0,"karnool"));
		//Static method
		List<Employee> resultList = arrayList.stream().sorted(MethodReferenceDemo::compare).collect(Collectors.toList());
		System.out.println("Employees details in Acending order based on salary: "+resultList.toString());
		//object reference
		MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
		List<Employee> resultList2 = arrayList.stream().sorted(methodReferenceDemo::compareName).collect(Collectors.toList());
		System.out.println("Employees details in Acending order based on name: "+resultList2.toString());
		//Constructor
		EmployeeInterfaceDemo obj = Employee::new;
		//Employee o = new Employee("neelima",3000.0,"hyderabad");
		System.out.println("values : "+obj.getDetails("neelima",3000.0,"hyderabad"));
		
		EmployeeInterfaceDemo3 obj3 = Employee::new;
		System.out.println("values : "+obj3.getDetails());
		
		EmployeeInterfaceDemo2 obj2 = Employee::new;
		System.out.println("values : "+obj2.getDetails("nikila"));
	
	}
}
