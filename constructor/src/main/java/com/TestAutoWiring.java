package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWiring {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ClassA a1 = (ClassA) context.getBean("a1");
		System.out.println(a1);
		
		ClassA a2 = (ClassA) context.getBean("a2");
		System.out.println(a2);	
	}
}