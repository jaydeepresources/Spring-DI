package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSampleClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		SampleClass s1 = (SampleClass) context.getBean("sample");

		System.out.println(s1);
		
		((AbstractApplicationContext) context).registerShutdownHook();
		
	}
}