package com.app.template;

public class DevelopmentStatus implements State{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Development is in start state");
	}

	@Override
	public void intermediate() {
		// TODO Auto-generated method stub
		System.out.println("Development is in start intermediate");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Development is in start stop");
	}
}
