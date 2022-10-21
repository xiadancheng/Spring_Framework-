package com.zhouyu.mybatis.spring1;

import com.zhouyu.mapper.OrderMapper;
import com.zhouyu.mapper.UserMapper;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

public class GouShangImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {

		Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(GouMapperScan.class.getName());
		String path =(String) annotationAttributes.get("value");

		System.out.println(path);
//		scaner


//		GouShangScanner scanner = new GouShangScanner(registry);




		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition.setBeanClass(GouShangFactryBean.class);
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(UserMapper.class);
		registry.registerBeanDefinition("userMapper",beanDefinition);

		AbstractBeanDefinition beanDefinition1 = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition1.setBeanClass(GouShangFactryBean.class);
		beanDefinition1.getConstructorArgumentValues().addGenericArgumentValue(OrderMapper.class);
		registry.registerBeanDefinition("orderMapper",beanDefinition1);


	}

}
