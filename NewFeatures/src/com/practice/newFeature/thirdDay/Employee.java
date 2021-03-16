package com.practice.newFeature.thirdDay;

public class Employee {
		String name;
		Double salary;
		String city;
		
		public Employee(String name, Double salary, String city) {
			this.name = name;
			this.salary = salary;
			this.city = city;
		}
		public Employee(String name) {
			this.name = name;
		}
		public Employee() {
			
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getSalary() {
			return salary;
		}

		public void setSalary(Double salary) {
			this.salary = salary;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + ", city=" + city + "]";
		}
		

}
