package org.jerson.springdemo.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//Triangle triangle = new Triangle();
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Shape shape = (Shape)context.getBean("triangle");
		shape.draw();
		shape=(Shape)context.getBean("circle");
		shape.draw();
	}
}