package com.zhouyu;

import com.zhouyu.service.OrderService;
import com.zhouyu.service.UserService;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;


public class Test {

	public static void main(String[] args) throws IOException {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);

		context.refresh();

		UserService userService = context.getBean(UserService.class);
		System.out.println(userService.getClass().getName());
	}





	}








