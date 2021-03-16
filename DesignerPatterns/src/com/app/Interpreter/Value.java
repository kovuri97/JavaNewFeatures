package com.app.Interpreter;

public class Value implements Expression {
	private String data;

	public Value(String data) {
		super();
		this.data = data;
	}

	@Override
	public boolean interpret(String value) {
		// TODO Auto-generated method stub
		if(value.contains(data))
			return true;
		return false;
	}

}
