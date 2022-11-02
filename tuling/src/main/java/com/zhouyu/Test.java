package com.zhouyu;

import com.zhouyu.advice.GousangMethodMatcher;
import com.zhouyu.advice.ZhouyuAfterReturningAdvice;
import com.zhouyu.advice.ZhouyuAroundAdvice;
import com.zhouyu.advice.ZhouyuBeforeAdvice;
import com.zhouyu.advisor.ZhouyuPointcutAdvisor;
import com.zhouyu.service.OrderService;
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
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;


public class Test {

	public static void main(String[] args) throws IOException {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		UserService userService = context.getBean("userService", UserService.class);

		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition.setBeanClass(OrderService.class);
		beanDefinition.setScope("prototype");
		context.registerBeanDefinition("orderService",beanDefinition);
		context.refresh();


	}

	}








