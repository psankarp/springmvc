package com.example.ioc;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("appContext.xml");

		Target t1=context.getBean("target1",Target.class);
		System.out.println(t1);
		
		Target t2=context.getBean("target2",Target.class);
		System.out.println(t2);
		
		Target t3=context.getBean("target3",Target.class);
		System.out.println(t3);
		
	}

}
