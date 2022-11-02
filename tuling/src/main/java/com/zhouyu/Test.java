package com.zhouyu;

import com.zhouyu.advice.GousangMethodMatcher;
import com.zhouyu.advice.ZhouyuAfterReturningAdvice;
import com.zhouyu.advice.ZhouyuAroundAdvice;
import com.zhouyu.advice.ZhouyuBeforeAdvice;
import com.zhouyu.advisor.ZhouyuPointcutAdvisor;
import com.zhouyu.editor.StringToUserConverter;
import com.zhouyu.editor.StringToUserPropertyEditor;
import com.zhouyu.service.OrderService;
import com.zhouyu.service.User;
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
import org.springframework.beans.SimpleTypeConverter;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.SimpleMetadataReaderFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Locale;


public class Test {

	public static void main(String[] args) throws IOException {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		context.register();

/*
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition.setBeanClass(OrderService.class);
		beanDefinition.setScope("prototype");
		context.registerBeanDefinition("orderService",beanDefinition);*/

	/*	AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader(context);
		annotatedBeanDefinitionReader.register(User.class);*/

		/*ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(context);
		scanner.scan("con.zhouyu");*/


//		context.refresh();


	/*	UserService userService = context.getBean("userService", UserService.class);
		userService.test();
*/
/*		DefaultConversionService conversionService = new DefaultConversionService();
		conversionService.addConverter(new StringToUserConverter());
		User value = conversionService.convert("aaaa", User.class);
		System.out.println(value);*/

	/*	UserService userService = context.getBean("userService", UserService.class);
		System.out.println(userService);*/
		System.out.println(context.getBean("userService"));
/*
		System.out.println(context.getBean("&zhouyuFactoryBean"));*/
	}

	}








