package com.app.Interpreter;

public class Student implements Expression{
	private Expression name;
	private Expression value;
	
	public Student(Expression name, Expression value) {
		super();
		this.name = name;
		this.value = value;
	}

	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		return name.interpret(context) && value.interpret(context);
	}
}
