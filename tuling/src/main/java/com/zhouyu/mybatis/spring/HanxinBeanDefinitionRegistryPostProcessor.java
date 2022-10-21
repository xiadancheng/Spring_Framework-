package com.zhouyu.mybatis.spring;

import com.zhouyu.mapper.OrderMapper;
import com.zhouyu.mapper.UserMapper;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


//@Component
public class HanxinBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

		//扫描  路径


		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();

		beanDefinition.setBeanClass(HanxinFactoryBean.class);
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(UserMapper.class);
		registry.registerBeanDefinition("userMapper",beanDefinition);//beanName----->userMapper----->userMapper代理对象
		AbstractBeanDefinition beanDefinition1 = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition1.setBeanClass(HanxinFactoryBean.class);
		beanDefinition1.getConstructorArgumentValues().addGenericArgumentValue(OrderMapper.class);
		registry.registerBeanDefinition("orderMapper",beanDefinition1);//beanName---->orderMapper---->orderMapper代理对象
	}
}
