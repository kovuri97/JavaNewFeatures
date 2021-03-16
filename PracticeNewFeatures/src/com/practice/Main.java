package com.practice;
 import com.practice.secondDay.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicalImplementationDemo vehicalImplementationDemo = new VehicalImplementationDemo();
		vehicalImplementationDemo.prize(300);
		vehicalImplementationDemo.lambdaExpression();
		vehicalImplementationDemo.AnonymousClass();
		
		LambdaEmpressionDemo lambdaEmpressionDemo = new LambdaEmpressionDemo();
		lambdaEmpressionDemo.lamdaExpression();
		
		ImplementationDemo implementationDemo = new ImplementationDemo();
		implementationDemo.displayName();
		implementationDemo.show();
		implementationDemo.method1();
		
		//Multiple Inheritance
		MultipleInheritance multipleInheritance = new MultipleInheritance();
		multipleInheritance.m1();
		multipleInheritance.m3();
		
		InnerClassDemo innerClassDemo = new InnerClassDemo(5,"Jho");
		innerClassDemo.displayDetails();
		innerClassDemo.add(4,5);
		InnerClassDemo.InnerClass innerClass = innerClassDemo.new InnerClass();
		innerClass.displayDetails();
		innerClass.lambdaExpression();
		innerClass.show();
		innerClass.add(6,7);
		
		LinkedListDemo linkedListDemo = new LinkedListDemo();
		linkedListDemo.method();
		
		Employee1 predicateInterface =new Employee1();
		predicateInterface.method();
		
		EmployeeDemo employee =new EmployeeDemo();
		employee.method();
		
		StudentDemo student = new StudentDemo();
		student.method();
	}

}
