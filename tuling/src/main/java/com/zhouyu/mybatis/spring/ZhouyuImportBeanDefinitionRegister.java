package com.zhouyu.mybatis.spring;

import com.zhouyu.mapper.OrderMapper;
import com.zhouyu.mapper.UserMapper;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.AbstractClassTestingTypeFilter;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
import java.util.Map;

public class ZhouyuImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {


//	importingClassMetadata----注解元数据信息
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {

		//扫描  路径

		Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(HanxinMapperScan.class.getName());
		String path	 =(String) annotationAttributes.get("value");
		System.out.println(path);

		ZhouyuBeanDefinitionScanner scanner = new ZhouyuBeanDefinitionScanner(registry);

		scanner.addIncludeFilter(new TypeFilter() {
			@Override
			public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
				return true;
			}
		});
		scanner.scan(path);

	}
}
