package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSampleClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		SampleClass sc1 = (SampleClass) context.getBean("sample");
		
//		SampleClass sc2 = (SampleClass) context.getBean("anotherSample");
//
//		System.out.println(sc1);
//		System.out.println(sc2);
//
//		sc1.a.str = "?";
//
//		System.out.println(sc1);
//		System.out.println(sc2);
	}
}
