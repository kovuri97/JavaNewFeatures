package com.practice.newFeature.thirdDay;
@FunctionalInterface
public interface EmployeeInterfaceDemo {
	public Employee getDetails(String name, Double salary, String city);
}
@FunctionalInterface
interface EmployeeInterfaceDemo2 {
	public Employee getDetails(String name);
}
@FunctionalInterface
interface EmployeeInterfaceDemo3 {
	public Employee getDetails();
}