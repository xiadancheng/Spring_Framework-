package com.zhouyu.service;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class HanxinImport implements DeferredImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{UserService.class.getName(),OrderService.class.getName()};
	}

/*//	注册beanDefinition
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
		ImportBeanDefinitionRegistrar.super.registerBeanDefinitions(importingClassMetadata, registry, importBeanNameGenerator);
	}*/
}
