package com.example.ioc;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestLifeCycle {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("appContext.xml");
		context.getBean("myclass1");
	}

}
