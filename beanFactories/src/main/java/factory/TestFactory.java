package factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springFactory.xml");
		Shape shape = (Shape)context.getBean("someShape");
		shape.calcArea();
		System.out.println(shape);
	}
}
