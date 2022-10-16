package com.zhouyu.service;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;


@Component
public class OrderService2 implements BeanNameAware {

	private String beanName;
	@Override
	public void setBeanName(String name) {
		this.beanName=name;
	}



	@Override
	public String toString() {
		return "OrderService{" +
				"beanName='" + beanName + '\'' +
				'}';
	}
}