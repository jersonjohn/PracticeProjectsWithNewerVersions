package org.jerson.springdemo.main;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{
	
	private Point point;
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub		
		System.out.println("Circle create ( X:"+point.getX()+" Y:"+point.getY()+")");		
	}

	public Point getPoint() {
		return point;
	}

    @Resource(name="point5")
	public void setPoint(Point point) {
		this.point = point;
	}
    
    @PostConstruct
    public void initCircle() {
    	System.out.println("Init for Circle called!!!");
    }
    
    @PreDestroy
    public void destroyCircle() {
    	System.out.println("Destroy for circle called!!");
    }
}