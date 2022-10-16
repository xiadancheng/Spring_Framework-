package com.zhouyu.service;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
@RoundRobin
public class RoundRobinStrategy implements LoadBalance, BeanNameAware {
	private String beanName;

	@Override
	public String select() {
		return null;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName=name;
	}

	@Override
	public String toString() {
		return "RoundRobinStrategy{" +
				"beanName='" + beanName + '\'' +
				'}';
	}
}
