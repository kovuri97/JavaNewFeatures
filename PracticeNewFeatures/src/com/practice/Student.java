package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Student {
	String name;
	long rollNum;
	String city;
	
	public Student(String name, long rollNum, String city) {
		this.name = name;
		this.rollNum = rollNum;
		this.city = city;
	}
}

class StudentDemo{
	public void method() {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the count how many students you want to enter:");
		int count = s.nextInt();
		System.out.println("Enter students Details:");
		List<Student> arrayList = new ArrayList<Student>();
		for(int i=1;i<=count;i++) {
			System.out.println("Enter students Details of :"+i);
			String name = s.next();
			long rollNum = s.nextLong();
			String city = s.next();
			arrayList.add(new Student(name,rollNum,city));
		}
		List<Student> resultList = arrayList.stream().sorted((s1,s2)->-(String.valueOf(s1.rollNum)).compareTo(String.valueOf(s2.rollNum))).collect(Collectors.toList());
		System.out.println("Student details in decending order based on salary: "+resultList);
		resultList.forEach(i->{System.out.println(i.name+" "+i.rollNum+" "+i.city);});
		
		Student maxValue = arrayList.stream().max((s1,s2)->(String.valueOf(s1.rollNum)).compareTo(String.valueOf(s2.rollNum))).get();
		System.out.println("max value of result list: "+maxValue.rollNum);
		
		Student minValue = arrayList.stream().min((s1,s2)->(String.valueOf(s1.rollNum)).compareTo(String.valueOf(s2.rollNum))).get();
		System.out.println("min value of result list: "+minValue.rollNum);
		
		List uppercase = arrayList.stream().map(s1->s1.name.toUpperCase()).collect(Collectors.toList());
		System.out.println("Students details with uppercase "+uppercase);
		
	}
}
