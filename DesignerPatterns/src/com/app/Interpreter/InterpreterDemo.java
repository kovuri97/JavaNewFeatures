package com.app.Interpreter;

import java.util.Scanner;

public class InterpreterDemo {
	public static Expression getemployee() {
		Expression employee = new Value("Neelima");
		Expression employeeValue = new Value("Employee");
		return new Employee(employee,employeeValue);
		}
	public static Expression getstudent() {
		Expression employee = new Value("Neelima");
		Expression employeeValue = new Value("Student");
		return new Student(employee,employeeValue);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expression employee = getemployee();
		Expression student = getstudent();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter data");
		String data = s.nextLine();
		System.out.println("neelima is employee: "+employee.interpret(data));
		System.out.println("neelima is student: "+student.interpret(data));
	}
}
