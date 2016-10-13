package org.jerson.springdemo.main;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class myBeanFactoryPP implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println("My Bean Factory Post Processer!!!");
	}

}
