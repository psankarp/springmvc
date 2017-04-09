package com.example.ioc;

import org.springframework.beans.factory.InitializingBean;

public class MyClass implements InitializingBean{
	
	public MyClass() {
		super();
		//System.out.println("constructor...");
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName() method is called");
		this.name = name;
	}
	
	public void init(){
		System.out.println("init() method is called");
	}
	
	
	public void postConstructMethod(){
		System.out.println("postConstructMethod() method is called");
	}


	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() method is called");
		
	}
	

}
