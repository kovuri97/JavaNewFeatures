package com.app.springDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("engg")
public class Engine {
	@Value("101")
	private int id;
	@Value("deisel")
	private String type;
	@Override
	public String toString() {
		return "Engine [id=" + id + ", type=" + type + "]";
	}
}
