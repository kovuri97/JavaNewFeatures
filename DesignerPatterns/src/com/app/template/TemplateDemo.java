package com.app.template;

public class TemplateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		State dev = new DevelopmentStatus();
		State test = new TestingStatus();
		dev.stages();
		test.stages();	
	}

}
