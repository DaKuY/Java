package com.andrewcamero.spring;

import java.util.Map;

/*
 * Object that spring will fill using the Spring beans
 */
public class HelloWorld {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println("Hello "+name+"!!!!");
	}
	
}
