package com.zhouyu.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ZhouyuBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		if (beanName.equals("userService")){

			System.out.println("初始化前"+bean);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("userService")){

			System.out.println("初始化后"+bean);
		}
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
