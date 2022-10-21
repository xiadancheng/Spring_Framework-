package com.zhouyu.mybatis.spring1;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

public class GouShangScanner extends ClassPathBeanDefinitionScanner {
	public GouShangScanner(BeanDefinitionRegistry registry) {
		super(registry);
	}
}
