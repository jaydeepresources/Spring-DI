package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import containment.*;
public class DrawingApp {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		PointTriangle triangle = (PointTriangle)context.getBean("PointTriangle");
		triangle.draw();

	}
}
