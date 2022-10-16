package com.zhouyu;

import com.zhouyu.service.OrderService;
import com.zhouyu.service.User;
import com.zhouyu.service.UserService;
import com.zhouyu.service2.AService;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.SimpleMetadataReaderFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.TypeVariable;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.function.Supplier;


public class Test {

	public static void main(String[] args) throws IOException {
//		BeanFactory------>解析配置------>扫描----->BeanDefinition------->beanDefinitionMap----->beanPostProcessor,单例池
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
/*//		AnnotationConfigWebApplicationContext context1 = new AnnotationConfigWebApplicationContext();
		context1.register(AppConfig.class);

		context1.getEnvironment().setRequiredProperties("aaaa");
		context1.refresh();
//		Root WebApplicationContext
		context1.publishEvent("111111");*/

		UserService userService = context1.getBean("userService", UserService.class);
		userService.test();


	}








	}








