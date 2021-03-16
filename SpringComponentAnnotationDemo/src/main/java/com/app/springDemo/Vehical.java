package com.app.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehical")
public class Vehical {
	@Autowired 
	Engine engg;

	@Override
	public String toString() {
		return "Vehical [engg=" + engg + "]";
	}

}
