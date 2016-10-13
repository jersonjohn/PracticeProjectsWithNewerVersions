package org.jerson.springdemo.main;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape,ApplicationContextAware,BeanNameAware,InitializingBean,DisposableBean {
	
	private List<Point> points;
	
	private ApplicationContext context = null;
	
	public void draw() {
		
		for(Point point:points) {
		
			System.out.println("Point X:"+point.getX()+" Y:"+point.getY());
		}
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		//this.beanName = beanName;
		System.out.println("Bean Name:"+beanName);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		
		this.context = context;
		
	}

	public ApplicationContext getContext() {
		return context;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Bean distroy completed from class !!");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Bean Initialization is completed from class!!");
		
	}
	
	public void myInit() {
		System.out.println("Bean Initialization is completed!!");
	}
	
	public void cleanUp() {
		
		System.out.println("Bean distroy completed!!");
		
	}
}
