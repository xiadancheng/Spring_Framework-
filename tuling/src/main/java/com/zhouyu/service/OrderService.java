package com.zhouyu.service;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.annotation.*;
import org.springframework.context.event.EventListener;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;
import java.lang.annotation.Annotation;



//@Component("a")
public class OrderService  {
//	private String beanName;


/*
	@Override
	public void setBeanName(String name) {
		System.out.println(name);
			this.beanName=name;
	}*/

/*
	@Bean
	public UserService userService(){
		return new UserService();
	}
*/

/*	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{UserService.class.getName()};
	}*/
}