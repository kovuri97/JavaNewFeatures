package com.app;


public class Factory {
	public Laptop getLaptopName(String loptopName) {
		if(loptopName.equals("Dell")) {
			Dell d =new Dell();
			d.companyName();
			return d;
		}
		else if(loptopName.equals("Lenovo")) {
			Lenovo l = new Lenovo();
			l.companyName();
			return l;
		}
		return null;
	}
}
