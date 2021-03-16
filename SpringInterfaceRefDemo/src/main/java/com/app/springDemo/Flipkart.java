package com.app.springDemo;

import java.util.Random;
import java.util.Set;

public class Flipkart {
	private Courier courier;

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	 
	public String shopping(String[] items) {
		Random r = new Random();
		int orderId = r.nextInt(10000);
		return "dasd";
	}

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + "]";
	}
}
