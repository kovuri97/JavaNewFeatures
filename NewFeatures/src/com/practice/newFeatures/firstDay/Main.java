package com.practice.newFeatures.firstDay;

import com.practice.newFeature.thirdDay.MethodReferenceDemo;
import com.practice.newFeatures.secondDay.FunctionInterface;
import com.practice.newFeatures.secondDay.PredicateInterface;
import com.practice.newFeatures.secondDay.StreamsDemo;

public class Main {
public static void main(String []args) {
	LambdaEmpressionDemo lambdaEmpressionDemo = new LambdaEmpressionDemo();
	lambdaEmpressionDemo.lamdaExpression();
	AnonymousClassDemo anonymousClassDemo = new AnonymousClassDemo();
	anonymousClassDemo.anonymousclass();
	anonymousClassDemo.anonymousclass2();
	//functional interface 
	Demo d = new Demo();
	d.m1();
	d.m2();
	//multiple inheritance
	MultipleInheritanceDemo m = new MultipleInheritanceDemo();
	m.m1();
	//Inheritance
	Inheritance1 inheritance2 = new Inheritance1();
	inheritance2.add(3,6);
	inheritance2.subtract(6,2);
	InheritanceDemo inheritance = new InheritanceDemo();
	inheritance.add(7,6);
	inheritance.multiple(4,4);
	Inheritance1 inheritance3 = new InheritanceDemo();
	inheritance3.add(3,6);
	inheritance3.subtract(6,2);
	inheritance3.multiple(2,4);
	
	PredicateInterface predicateInterface = new PredicateInterface();
	predicateInterface.method();
	predicateInterface.method1();
	
	FunctionInterface functionInterface = new FunctionInterface();
	functionInterface.method();
	
	StreamsDemo streamsDemo = new StreamsDemo();
	streamsDemo.streamFunction1();
	streamsDemo.streamFunction2();
	
	MethodReferenceDemo methodReferenceDemo  = new MethodReferenceDemo();
	methodReferenceDemo.method1();
}
}
