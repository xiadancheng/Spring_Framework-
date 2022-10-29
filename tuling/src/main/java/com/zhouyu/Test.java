package com.zhouyu;

import com.zhouyu.advice.GousangMethodMatcher;
import com.zhouyu.advice.ZhouyuAfterReturningAdvice;
import com.zhouyu.advice.ZhouyuAroundAdvice;
import com.zhouyu.advice.ZhouyuBeforeAdvice;
import com.zhouyu.advisor.ZhouyuPointcutAdvisor;
import com.zhouyu.service.UserService;
import com.zhouyu.service.UserServiceInterface;
import org.aopalliance.aop.Advice;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.framework.adapter.AfterReturningAdviceInterceptor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;


public class Test {

	public static void main(String[] args) throws IOException {
/*

		UserService target = new UserService();

		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(target);
//		proxyFactory.setProxyTargetClass(true);
		proxyFactory.setInterfaces(UserServiceInterface.class);
		proxyFactory.addAdvice(new ZhouyuBeforeAdvice());
		proxyFactory.addAdvice(new ZhouyuAroundAdvice());
		proxyFactory.addAdvisor(new ZhouyuPointcutAdvisor());
//		proxyFactory.setProxyTargetClass(true);




		UserServiceInterface userService = (UserServiceInterface) proxyFactory.getProxy();//获取代理对象

		userService.test();//advice链
*/

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Object boFactoryBean = context.getBean("boFactoryBean");

//		System.out.println(boFactoryBean);

	}

	}








