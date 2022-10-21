package com.zhouyu.mybatis.spring;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

import java.util.Set;

public class ZhouyuBeanDefinitionScanner extends ClassPathBeanDefinitionScanner {


	public ZhouyuBeanDefinitionScanner(BeanDefinitionRegistry registry) {
		super(registry);
	}




	@Override
	protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
		return beanDefinition.getMetadata().isInterface();
	}

	@Override
	protected Set<BeanDefinitionHolder> doScan(String... basePackages) {
		Set<BeanDefinitionHolder> beanDefinitionHolders = super.doScan(basePackages);
		for (BeanDefinitionHolder beanDefinitionHolder : beanDefinitionHolders) {
			BeanDefinition beanDefinition = beanDefinitionHolder.getBeanDefinition();
			beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(beanDefinition.getBeanClassName());
			beanDefinition.setBeanClassName(HanxinFactoryBean.class.getName());
		}
		return beanDefinitionHolders;
	}
}
