package com.app.template;

public interface State {
	public void start();
	public void intermediate();
	public void stop();
	default void stages() {
		start();
		intermediate();
		stop();
	}
}
