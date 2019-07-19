package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSingle {

	public static void main(String[] args) throws InterruptedException {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Single s = (Single) context.getBean("a");
		System.out.println(s);
	}
}
